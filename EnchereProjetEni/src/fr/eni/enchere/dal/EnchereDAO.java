package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Enchere;

public interface EnchereDAO {
	
	Enchere selectById(int id) throws DALException;
	void update(Enchere data) throws DALException;
	void insert(Enchere data) throws DALException;
	void delete(int id) throws DALException;
	List<Enchere> selectAll() throws DALException;


}
