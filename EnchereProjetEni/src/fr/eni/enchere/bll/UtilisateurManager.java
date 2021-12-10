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

	/** SINGLETON **/
	private static UtilisateurManager instance;

	public static UtilisateurManager getInstance() {
		if (instance == null) {
			instance = new UtilisateurManager();
		}
		return instance;
	}

	public UtilisateurManager() {}

	/** FIN SINGLETON **/
	
	private  UtilisateurDAO dao = DAOFactory.getUtilisateurDAO();

	public  Utilisateur selectById(int idUtilisateur) throws BLLException {
		try {
			return dao.selectById(idUtilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}
	
	public Utilisateur afficherProfil(String pseudo) throws BLLException {

		BLLException ex = new BLLException();
		validationPseudo(pseudo, ex);
		Utilisateur utilisateur = null;
		try {
			utilisateur = dao.afficherProfil(pseudo);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilisateur;

	}  

	public  Utilisateur selectUtilisateurByPseudo(String pseudo) throws BLLException {
		try {
			return dao.selectUtilisateurByPseudo(pseudo);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}

	public  void delete(int idUtilisateur) throws BLLException {
		try {
			dao.delete(idUtilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		}
	}

	public  List<Utilisateur> selectAll() throws BLLException {
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

	public void update( int idUtilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse) throws BLLException {
		BLLException ex = new BLLException();
	
		Utilisateur a = new Utilisateur(idUtilisateur, pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
	
		try {
			dao.update(a);
		} catch (DALException e) {
			e.printStackTrace();
			
			ex.ajouterErreur(e);
			throw ex;
		}
	}

	public  void insert(Utilisateur aJouUtilisateur) throws DALException {
		dao.insert(aJouUtilisateur);
	}

	public  Utilisateur rechercher(String pseudo, String motDePasse) throws DALException {
		return dao.rechercher(pseudo, motDePasse);
	}

	// public static List<ArticleVendu> selectArticlesVendus ()throws BLLException{
	// return utilisateurDAO.getAllArticlesVendus(utilisateur);
	// }
	private void validationPseudo(String pseudo, BLLException ex) throws BLLException {
		if (pseudo == null || pseudo.isEmpty() || pseudo.length() > 30) {
			ex.ajouterErreur(new ParameterException(
					"Le pseudo est obligatoire et doit avoir une longueur comprise entre 1 et 30"));
		}
	}


}
