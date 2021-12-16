package fr.eni.enchere.bll;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Retrait;
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
	
	public  ArticleVendu selectByIdArticle(int idArticle) throws BLLException {
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
	
	public void updateArticle(int idArticle, String nomArticle, String categorie, String description, int prixVente, LocalDateTime dateDebutEnchere,
			LocalDateTime dateFinEnchere, Retrait lieuRetrait) throws DALException, SQLException {
		
	ArticleVendu articleVendu = new ArticleVendu(idArticle, nomArticle, categorie, description, prixVente, dateDebutEnchere,
			dateFinEnchere, lieuRetrait);
	dao.update(articleVendu);
	
	try {
		dao.update(articleVendu);
	} catch (DALException e) {
		e.printStackTrace();
		BLLException ex = new BLLException();
		ex.ajouterErreur(e);
		throw e;
	}
		
	}
	
	public  void insertArticle(ArticleVendu ajoutArticle) throws DALException {
		dao.insert(ajoutArticle);
	}
	
	public  void deleteArticle(int idArticle) throws BLLException {
		try {
			dao.delete(idArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}
	
	public  List<ArticleVendu> selectAll() throws BLLException {
		try {
			return dao.selectAll();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}
	
	public  ArticleVendu selectByUser(int id) throws BLLException, SQLException {
		// TODO verif SQL Exceptions
		try {
			return dao.selectByUser(id);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}
	
	public  ArticleVendu rechercher(String nomArticle) throws DALException {
		return dao.rechercher(nomArticle);
	}
	
	public ArticleVendu afficherArticle(String nomArticle) throws BLLException {

		ArticleVendu articleVendu = null;
		try {
			articleVendu = dao.afficherArticle(nomArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleVendu;

	} 
	

	
}
