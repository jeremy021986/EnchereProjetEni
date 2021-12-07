package fr.eni.enchere.dal;

import fr.eni.enchere.dal.jdbc.ArticleVenduDAOJdbcImpl;
import fr.eni.enchere.dal.jdbc.EnchereDAOJdbcImpl;
import fr.eni.enchere.dal.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO() {
		UtilisateurDAO dao = new UtilisateurDAOJdbcImpl();
		
		return dao;
	}
	
	public static EnchereDAO getEnchereDAO() {
		EnchereDAO dao = new EnchereDAOJdbcImpl();
		
		return dao;
	}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		ArticleVenduDAO dao = new ArticleVenduDAOJdbcImpl();
		
		return dao;
	}

}
		
		
		
		
