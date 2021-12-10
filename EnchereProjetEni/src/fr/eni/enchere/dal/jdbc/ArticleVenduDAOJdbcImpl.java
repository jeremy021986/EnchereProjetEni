package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private final static String SELECT_ALL = "SELECT av.id as id_no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie"
			+ "FROM ARTICLES_VENDUS av inner join RETRAITS r on (av.id = r.no_article";

	private final static String SELECT_BY_ID = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=?";
	private final static String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article, nom_article, description, date_debut_encheres,date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?,?,?)";
	// TODO INSERT RETRAIT//
	private static final String UPDATE = "update ARTICLES_VENDUS set nom_article = ?, description = ?,"
			+ "							 date_debut_encheres=?, date_fin_encheres= ?, prix_initial= ?, prix_vente= ?, "
			+ "							 no_utilisateur= ?, no_categorie=?, no_retrait=? where no_article= ? ";
	private final static String DELETE = "DELETE FROM ARTICLES_VENDUS WHERE idArticle=?";
	private final static String SELECT_BY_USER = "SELECT * FROM ARTICLES_VENDUS where no_utilisateur=?";

	public ArticleVenduDAOJdbcImpl() {

	}

	@Override
	public ArticleVendu selectById(int idArticle) throws DALException {
		ArticleVendu article = null;

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pStmt = cnx.prepareStatement(SELECT_BY_ID);
			pStmt.setInt(1, idArticle);

			ResultSet rs = pStmt.executeQuery();
			if (rs.next()) {
				article = map(rs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

		return article;
	}

	@Override
	public void update(ArticleVendu articleVendu) throws DALException, SQLException {

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement statement = cnx.prepareStatement(UPDATE);

			statement.setInt(10, articleVendu.getIdArticle());
			statement.setString(1, articleVendu.getNomArticle());
			statement.setString(2, articleVendu.getDescription());
			statement.setInt(8, articleVendu.getIdCategorie());
			statement.setInt(5, articleVendu.getPrixInitial());
			statement.setInt(6, articleVendu.getPrixVente());
			statement.setTimestamp(3, Timestamp.valueOf(articleVendu.getDateDebutEnchere()));
			statement.setTimestamp(4, Timestamp.valueOf(articleVendu.getDateFinEnchere()));
			statement.setInt(7, ((Utilisateur) articleVendu.getListeUtilisateur()).getIdUtilisateur());
			statement.setInt(9, articleVendu.getLieuRetrait().getIdRetrait());

			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public void insert(ArticleVendu nouvelArticle) throws DALException {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			// Statement.RETURN_GENERATED_KEYS -> permet de r�cup�rer les cl�s primaires
			// g�n�r�es pendant la requ�te
			PreparedStatement pStmt = cnx.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			pStmt.setInt(1, nouvelArticle.getIdArticle());
			pStmt.setString(2, nouvelArticle.getNomArticle());
			pStmt.setString(3, nouvelArticle.getDescription());
			pStmt.setTimestamp(4, Timestamp.valueOf(nouvelArticle.getDateDebutEnchere()));
			pStmt.setTimestamp(5, Timestamp.valueOf(nouvelArticle.getDateFinEnchere()));
			pStmt.setInt(6, nouvelArticle.getPrixInitial());
			pStmt.setInt(7, nouvelArticle.getPrixVente());
			pStmt.setInt(8, ((Utilisateur) nouvelArticle.getListeUtilisateur()).getIdUtilisateur());
			pStmt.setInt(9, nouvelArticle.getIdCategorie());

			pStmt.executeUpdate();

			ResultSet rs = pStmt.getGeneratedKeys();
			if (rs.next()) {
				int idArticleInsere = rs.getInt(1); // 1 : premi�re colonne du résultat (qui n'en contient qu'une)
				nouvelArticle.setIdArticle(idArticleInsere);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

	}

	@Override
	public void delete(int idArticle) throws DALException {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pStmt = cnx.prepareStatement(DELETE);
			pStmt.setInt(1, idArticle);

			// n = nombre de lignes supprim�es (ici, soit 1 soit 0).
			pStmt.executeUpdate();

			// return n == 1;//si 1 ligne supprim�e --> true, sinon false
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}
	}

	@Override
	public List<ArticleVendu> selectAll() throws DALException {

		List<ArticleVendu> listeDesArticles = new ArrayList<ArticleVendu>();

		// Obtenir une connexion
		Connection cnx = ConnectionProvider.getConnection();

		// Obtient un objet de commande (Statement) = ordre SQL
		Statement pStmt = null;
		try {
			pStmt = cnx.createStatement();

			// Execute l'ordre SQL
			ResultSet rs = null;
			rs = pStmt.executeQuery(SELECT_ALL);

			// Interpreter les resultats = contruire l'arborescence d'objets métier
			// à partir des informations de la base de données
			ArticleVendu nouvelArticleVendu = null;
			Retrait nouveauRetrait = null;
			int idArticleOnline = -1; // "-1" signife "pas d'identifiant"

			while (rs.next()) {

				int idArticleVendu = rs.getInt("no_article");
				// Si c'est un nouvel article
				if (idArticleVendu != idArticleOnline) {
					int idArticle = rs.getInt("no_article");
					String nomArticle = rs.getString("nom_article");
					String description = rs.getString("description");
					LocalDateTime dateDebutEnchere = rs.getTimestamp("date_debut_encheres").toLocalDateTime();
					LocalDateTime dateFinEnchere = rs.getTimestamp("date_fin_encheres").toLocalDateTime();
					int prixInitial = rs.getInt("prix_initial");
					int prixVente = rs.getInt("prix_vente");
					int idUtilisateur = rs.getInt("no_utilisateur");
					int idCategorie = rs.getInt("no_categorie");

					// TODO Il faudra surement rajouter etatVente ainsi que dans la bo//

					nouvelArticleVendu = new ArticleVendu(idArticle, nomArticle, description, dateDebutEnchere,
							dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie);
					nouvelArticleVendu.setIdArticle(idArticleVendu);

					listeDesArticles.add(nouvelArticleVendu); // ajouter le nouvel article à la liste
					idArticleOnline = idArticleVendu; // Affiche l'article en enchère
				}

				// Instancier le retrait
				int idRetrait = rs.getInt("no_article");
				String rueRetrait = rs.getString("rue");
				String cpRetrait = rs.getString("code_postal");
				String villeRetrait = rs.getString("ville");

				nouveauRetrait = new Retrait(rueRetrait, cpRetrait, villeRetrait);

				// Ajouter le nouveau retrait à l'article en enchères (en cours)
				nouvelArticleVendu.getListeRetrait().add(nouveauRetrait);
			}
			cnx.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return listeDesArticles;

	}

	@Override
	public List<ArticleVendu> selectByUser(int id) throws DALException, SQLException {

		List<ArticleVendu> articlesVendus = new ArrayList<>();

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_USER);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			ArticleVendu articleVendu = null;

			while (rs.next()) {
				articleVendu = map(rs);
				articlesVendus.add(articleVendu);

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return articlesVendus;
	}

	public ArticleVendu map(ResultSet rs) throws SQLException {
		ArticleVendu article = null;
		rs.getInt("idArticle");
		rs.getString("nomArticle");
		rs.getString("description");
		rs.getDate("dateDebutEncheres");
		rs.getDate("dateFinEncheres");
		rs.getInt("prixInitial");
		rs.getInt("prixVente");
		rs.getInt("idUtilisateur");
		rs.getInt("idCategorie");

		// TODO verif conversion date
		return article;
	}
}
