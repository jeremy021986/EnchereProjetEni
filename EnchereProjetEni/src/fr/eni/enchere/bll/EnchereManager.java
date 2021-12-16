package fr.eni.enchere.bll;



import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFactory;
import fr.eni.enchere.dal.EnchereDAO;

public class EnchereManager {
		
	/** SINGLETON **/
	private static EnchereManager instance;

	public static EnchereManager getInstance() {
		if (instance == null) {
			instance = new EnchereManager();
		}
		return instance;
	}
	
	public EnchereManager() {}

	/** FIN SINGLETON **/
	
	private  EnchereDAO dao = DAOFactory.getEnchereDAO();

	public Enchere selectByIdArticle (int idArticle) throws BLLException {
		
		try {
			return dao.selectByArticle(idArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BLLException ex = new BLLException();
			ex.ajouterErreur(e);
			throw ex;
		} 
	}
	
	public Enchere update (Enchere nouvelEnchere) throws BLLException {
		
		BLLException es = new BLLException();
		
		Enchere e = new Enchere();
	
		try {
			dao.update(e);
		} catch (DALException ex) {
			ex.printStackTrace();
			
			es.ajouterErreur(ex);
			throw es;
		}
		return e;
	}


	public void insert (Enchere nouvelEnchere) throws BLLException {
		
		BLLException e = new BLLException();
		
		try {
			dao.insert(nouvelEnchere);
		} catch (DALException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			
			e.ajouterErreur(ex);
			throw e;
		}
		
	}
	
}
