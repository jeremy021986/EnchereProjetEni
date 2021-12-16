package fr.eni.enchere.dal;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.Retrait;

public interface RetraitDAO {

	public Retrait insert (Retrait retrait) throws BLLException;
	
}
