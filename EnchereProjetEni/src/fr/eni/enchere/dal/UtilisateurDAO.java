package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurDAO {
	
	Utilisateur selectById(int id) throws DALException;
	void update(Utilisateur data) throws DALException;
	void insert(Utilisateur data) throws DALException;
	void delete(int id) throws DALException;

}
