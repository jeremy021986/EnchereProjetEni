package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	
	Utilisateur selectById(int idUtilisateur) throws DALException;
	void update(Utilisateur MajUtilisateur) throws DALException;
	void insert(Utilisateur ajoutUtilisateur) throws DALException;
	void delete(int idUtilisateur) throws DALException;
	Utilisateur rechercher(String pseudo, String mdp) throws DALException; 
	Utilisateur selectUserByPseudo(String pseudo) throws DALException;
	public List<Utilisateur> getAll() throws BLLException;
	List<ArticleVendu> getAllArticlesVendus(Utilisateur utilisateur)throws BLLException;
	List<String> getAllPseudos()throws BLLException;
	
}
