package fr.eni.enchere.dal;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.Categorie;

public interface CategorieDAO {

	
	  Categorie SelectCategorieById(int id) throws BLLException ;
		
	
	
}
