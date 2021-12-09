package fr.eni.enchere.bll;

import java.sql.SQLException;
import java.time.LocalDate;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;
import fr.eni.enchere.dal.UtilisateurDAO;
import fr.eni.enchere.dal.jdbc.ArticleVenduDAOJdbcImpl;
import fr.eni.enchere.dal.jdbc.UtilisateurDAOJdbcImpl;

public class ArticleVenduManager {
	
	private static ArticleVenduDAO articleVenduDAO = new ArticleVenduDAOJdbcImpl();
	private static ArticleVendu articleVendu = new ArticleVendu();
	private static BLLException BLLException = new BLLException();
	
	/** SINGLETON **/
	private static ArticleVenduManager instance;

	public static ArticleVenduManager getInstance() {
		if (instance == null) {
			instance = new ArticleVenduManager();
		}
		return instance;
	}

	public ArticleVenduManager() {}

	/** FIN SINGLETON **/

	private  ArticleVenduDAO dao = DAOFactory.getArticleVenduDAO();
	
	public  ArticleVendu selectById(int idArticle) throws BLLException {
		try {
			return dao.selectById(idArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}
	
	public void update(int idArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
			LocalDate dateFinEnchere, int prixInitial, int prixVente, boolean etatVente, Categorie categorie,
			Utilisateur utilisateur, Enchere enchere) throws DALException, SQLException {
		
	ArticleVendu articleVendu = new ArticleVendu(idArticle, nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, etatVente,categorie,utilisateur,enchere);
	dao.update(articleVendu);
		
	}
	
}
