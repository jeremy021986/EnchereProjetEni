package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	private final static String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS";
	private final static String SELECT_BY_ID = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=?";
	private final static String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article, nom_article, description, date_debut_encheres,date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE = "update ARTICLES_VENDUS set nom_article = ?, description = ?,"
			+ "							 date_debut_encheres=?, date_fin_encheres= ?, prix_initial= ?, prix_vente= ?, "
			+ "							 no_utilisateur= ?, no_categorie=?, no_retrait=? where no_article= ? ";
	private final static String DELETE = "DELETE FROM ARTICLES_VENDUS WHERE idArticle=?";
	private final static String SELECT_BY_USER = "SELECT * FROM ARTICLES_VENDUS where no_utilisateur=?"
;	public ArticleVenduDAOJdbcImpl() {

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
			statement.setString(8, articleVendu.getCategorie().getLibelle());
			statement.setInt(5, articleVendu.getPrixInitial());
			statement.setInt(6, articleVendu.getPrixVente());
			statement.setDate(3, java.sql.Date.valueOf(articleVendu.getDateDebutEnchere()));
			statement.setDate(4, java.sql.Date.valueOf(articleVendu.getDateFinEnchere()));
			statement.setInt(7, articleVendu.getUtilisateur().getIdUtilisateur());
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
			pStmt.setDate(4,java.sql.Date.valueOf(nouvelArticle.getDateDebutEnchere()));
			pStmt.setDate(5,java.sql.Date.valueOf(nouvelArticle.getDateFinEnchere()));
			pStmt.setInt(6, nouvelArticle.getPrixInitial());
			pStmt.setInt(7, nouvelArticle.getPrixVente());
			pStmt.setInt(8, nouvelArticle.getUtilisateur().getIdUtilisateur());
			pStmt.setString(9, nouvelArticle.getCategorie().getLibelle());

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
		try(Connection cnx = ConnectionProvider.getConnection()) {			
			PreparedStatement pStmt = cnx.prepareStatement(DELETE);
			pStmt.setInt(1, idArticle);
			
			//n = nombre de lignes supprim�es (ici, soit 1 soit 0).
			pStmt.executeUpdate();
			
			//return n == 1;//si 1 ligne supprim�e --> true, sinon false
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}
	}	
		

	@Override
	public List<ArticleVendu> selectAll() throws DALException {
		List<ArticleVendu> listeDesArticles = new ArrayList<ArticleVendu>();
		// Obtenir une connexion
		try (Connection cnx = ConnectionProvider.getConnection()) {
			// Obtient une objet de commande (Statement) = ordre SQL
			Statement pStmt = cnx.createStatement();

			ResultSet rs = pStmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				ArticleVendu a = map(rs);
				listeDesArticles.add(a);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
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
		}
		return articlesVendus;
}
	public ArticleVendu map(ResultSet rs) throws SQLException {
		ArticleVendu article = null;
		int idArticle = rs.getInt("idArticle");
		String nomArticle = rs.getString("nomArticle");
		String description = rs.getString("description");
		Date dateDebutEncheres = rs.getDate("dateDebutEncheres");
		Date dateFinEncheres = rs.getDate("dateFinEncheres");
		int prixInitial = rs.getInt("prixInitial");
		int prixVente = rs.getInt("prixVente");
		int idUtilisateur = rs.getInt("idUtilisateur");
		int idCategorie = rs.getInt("idCategorie");
		
		//TODO verif conversion date
		return article;
	}
}
