package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private final static String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS";
	private final static String SELECT_BY_ID = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=?";
	private final static String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article, nom_article, description, date_debut_encheres,date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?,?,?)";
	private final static String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article=?,description=?, libelle=? WHERE idArticle=?";
	private final static String DELETE = "DELETE FROM ARTICLES_VENDUS WHERE idArticle=?";
	
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
	public void update(ArticleVendu articleModifie) throws DALException {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pStmt = cnx.prepareStatement(UPDATE);
			pStmt.setString(1, articleModifie.getNomArticle());
			pStmt.setString(2, articleModifie.getDescription());
			pStmt.setString(3, articleModifie.getLibelle());

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
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
			pStmt.setTimestamp(4,nouvelArticle.getDateDebutEnchere());
			pStmt.setTimestamp(5, nouvelArticle.getDateFinEnchere());
			pStmt.setInt(6, nouvelArticle.getMiseAprix());
			pStmt.setInt(7, nouvelArticle.getPrixVente());
			pStmt.setInt(8, nouvelArticle.getIdUtilisateur());
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
		try(Connection cnx = ConnectionProvider.getConnection()) {			
			PreparedStatement pStmt = cnx.prepareStatement(DELETE);
			pStmt.setInt(1, idArticle);
			
			//n = nombre de lignes supprim�es (ici, soit 1 soit 0).
			int n = pStmt.executeUpdate();
			
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
		
		
		return article;
	}

}
