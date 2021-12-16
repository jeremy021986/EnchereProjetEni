package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Enchere;

public interface EnchereDAO {
	
	Enchere selectByArticle(int idArticle) throws DALException;
	void update(Enchere nouvelEnchere) throws DALException;
	void insert(Enchere nouvelEnchere) throws DALException;

}
