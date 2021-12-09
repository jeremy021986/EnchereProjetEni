package fr.eni.enchere.bll;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DAOFactory;
import fr.eni.enchere.dal.UtilisateurDAO;
import fr.eni.enchere.dal.jdbc.UtilisateurDAOJdbcImpl;

public class UtilisateurManager {

	
	private static UtilisateurDAO utilisateurDAO = new UtilisateurDAOJdbcImpl();
	private static Utilisateur utilisateur = new Utilisateur();
	private static BLLException businessException = new BLLException();
	
	public UtilisateurManager() {
		UtilisateurManager.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}
	
	}

