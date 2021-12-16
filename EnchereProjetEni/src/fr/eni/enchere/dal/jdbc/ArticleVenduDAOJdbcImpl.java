package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private final static String RECHERCHER = "select * from ARTICLES_VENDUS where nom_article = ?";

	private final static String SELECT_ALL = "SELECT av.id as id_no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie"
			+ "FROM ARTICLES_VENDUS av inner join RETRAITS r on (av.id = r.no_article)"
			+ "FROM ARTICLES_VENDUS av inner join CATEGORIES c on (av.id = c.no_categorie)";

	private final static String SELECT_BY_ID = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=?";
	private final static String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article, nom_article, description, date_debut_encheres,date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?,?,?)";
	// TODO INSERT RETRAIT//
	private static final String UPDATE = "update ARTICLES_VENDUS set nom_article = ?, description = ?,"
			+ "							 date_debut_encheres=?, date_fin_encheres= ?, prix_initial= ?, prix_vente= ?, "
			+ "							 no_utilisateur= ?, no_categorie=?, no_retrait=? where no_article= ? ";
	private final static String DELETE = "DELETE FROM ARTICLES_VENDUS WHERE idArticle=?";
	private final static String SELECT_BY_USER = "SELECT * FROM ARTICLES_VENDUS where no_utilisateur=?";
	private static final String AFFICHER_ARTICLE = "SELECT no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie from ARTICLES_VENDUS where nom_article = ?";
	
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
			pStmt.setTimestamp(4,Timestamp.valueOf(nouvelArticle.getDateDebutEnchere()));
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
			Categorie nouvelleCategorie = null;
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

			// Instancier la catégorie
			int idCat = rs.getInt("no_categorie");
			String libelleCat = rs.getString("libelle");

			nouvelleCategorie = new Categorie(idCat, libelleCat);

			// Ajouter la nouvelle categorie à l'article en enchères (en cours)
			nouvelArticleVendu.getListeCategorie().add(nouvelleCategorie);

			cnx.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return listeDesArticles;

	}

	@Override
	public ArticleVendu selectByUser(int id) throws DALException {
		ArticleVendu articleVendu = null;

		try {
			Connection cnx = ConnectionProvider.getConnection();

			PreparedStatement stmt = cnx.prepareStatement(SELECT_BY_USER);
			stmt.setInt(1, id);
			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			if (rs.next()) {
				articleVendu = map(rs);
			}
			cnx.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

		return articleVendu;
	}

	public ArticleVendu rechercher(String nomArticle) throws DALException {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArticleVendu articleVendu = new ArticleVendu();

		try {
			cnx = ConnectionProvider.getConnection();
			pstmt = cnx.prepareStatement(RECHERCHER);
			pstmt.setString(1, nomArticle);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rs.getString("nomArticle");
				articleVendu.setNomArticle(rs.getString("nomArticle"));
				rs.getString("description");
				articleVendu.setDescription(rs.getString("description"));
				
				//TODO Vérifier les Statements Date début/fin enchère et lieu de retrait
				
//				rs.getLocalDateTime("dateDebutEnchere");
//				articleVendu.setDateDebutEnchere(rs.getString("dateDebutEnchere"));
//				rs.getLocalDateTime("dateFinEnchere");
//				articleVendu.setDateFinEnchere(rs.getString("dateFinEnchere"));
				rs.getInt("prixInitial");
				articleVendu.setPrixInitial(rs.getInt("prixInitial"));
				rs.getInt("prixVente");
				articleVendu.setPrixVente(rs.getInt("prixVente"));
				rs.getBoolean("etatVente");
				articleVendu.setEtatVente(rs.getBoolean("rue"));
//				rs.getRetrait("LieuRetrait");
//				articleVendu.setLieuRetrait(rs.getRetrait("LieuRetrait"));

				
			}
		} catch (SQLException e) {

			throw new DALException("Probleme - rechercherUtilisateur - " + e.getMessage());

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (cnx != null)
					cnx.close();
			} catch (SQLException e) {
				throw new DALException("Probleme - FermerConnexion - " + e.getMessage());
			}

		}
		return articleVendu;

	}
	
	public ArticleVendu afficherArticle(String nomArticle) throws DALException {

		ArticleVendu articleVendu = null;

		// Obtenir une connexion
		Connection cnx = ConnectionProvider.getConnection();

		// Obtient une objet de commande (Statement) = ordre SQL
		try {

			// Paramétrer l'objet de commande

			PreparedStatement pStmt = cnx.prepareStatement(AFFICHER_ARTICLE);
			pStmt.setString(1, nomArticle);

			// Execute l'ordre SQL
			ResultSet rs = null;
			rs = pStmt.executeQuery();

			if (rs.next()) {
				articleVendu = map(rs);
			}

			cnx.close();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return articleVendu;
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
