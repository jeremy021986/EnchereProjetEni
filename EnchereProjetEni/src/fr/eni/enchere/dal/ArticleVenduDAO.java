package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;





public interface ArticleVenduDAO {
	
	ArticleVendu selectById(int id) throws DALException;
	void update(ArticleVendu data) throws DALException;
	void insert(ArticleVendu data) throws DALException;
	void delete(int id) throws DALException;
	List<ArticleVendu> selectAll() throws DALException;


}
