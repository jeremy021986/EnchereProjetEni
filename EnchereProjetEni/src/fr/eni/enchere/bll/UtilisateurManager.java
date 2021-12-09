package fr.eni.enchere.bll;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
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
	
	public static Utilisateur selectById(int idUtilisateur) throws BLLException, DALException {
		return utilisateurDAO.selectById(idUtilisateur);
	}

	public static Utilisateur selectUserByPseudo(String pseudo) throws BLLException, DALException{
		return utilisateurDAO.selectUserByPseudo(pseudo);
	}
	
	public static void delete(int idUtilisateur) throws BLLException, DALException{
		utilisateurDAO.delete(idUtilisateur);
	}
	}

