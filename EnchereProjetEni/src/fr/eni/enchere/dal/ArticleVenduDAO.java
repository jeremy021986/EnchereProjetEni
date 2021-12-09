package fr.eni.enchere.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;





public interface ArticleVenduDAO {
	
	ArticleVendu selectById(int idArticle) throws DALException;
	void update(ArticleVendu articleVendu) throws DALException, SQLException;
	void insert(ArticleVendu articleVendu) throws DALException;
	void delete(int id) throws DALException;
	List<ArticleVendu> selectAll() throws DALException;
	List<ArticleVendu> selectByUser(int id) throws DALException, SQLException;


}
