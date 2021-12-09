package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
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

	public static Utilisateur selectUtilisateurByPseudo(String pseudo) throws BLLException, DALException{
		return utilisateurDAO.selectUtilisateurByPseudo(pseudo);
	}
	
	public static void delete(int idUtilisateur) throws BLLException, DALException{
		utilisateurDAO.delete(idUtilisateur);
	}
	
	public static List<Utilisateur> selectAll() throws BLLException, DALException {
		return utilisateurDAO.selectAll();
	}
	
	public static void update(Utilisateur majUtilisateur)throws BLLException, DALException{
		utilisateurDAO.update(majUtilisateur);
	}
	
	public static void insert(Utilisateur aJouUtilisateur) throws DALException {
		utilisateurDAO.insert(aJouUtilisateur);
	}
	
	public static Utilisateur rechercher(String pseudo, String motDePasse) throws DALException{
		return utilisateurDAO.rechercher(pseudo, motDePasse);
	}
	
	//public static List<ArticleVendu> selectArticlesVendus ()throws BLLException{
	//	return utilisateurDAO.getAllArticlesVendus(utilisateur);
	//}
	
	
	}

