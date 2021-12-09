package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

public interface UtilisateurDAO {
	
	Utilisateur selectById(int idUtilisateur) throws DALException;
	void update(Utilisateur MajUtilisateur) throws DALException;
	void insert(Utilisateur ajoutUtilisateur) throws DALException;
	void delete(int idUtilisateur) throws DALException;
	Utilisateur selectBypseudo(String pseudo) throws DALException;
	
}
