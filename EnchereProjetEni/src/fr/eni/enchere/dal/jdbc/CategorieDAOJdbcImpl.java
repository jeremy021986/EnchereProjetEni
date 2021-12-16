package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import fr.eni.enchere.bo.Categorie;

import fr.eni.enchere.dal.CategorieDAO;


public class CategorieDAOJdbcImpl implements CategorieDAO {

	private static final String GET_BY_ID = "select * from CATEGORIES where no_categorie=?";

	public Categorie SelectCategorieById(int idCategorie) {
		Categorie categorie = null;
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(GET_BY_ID);
			pstmt.setInt(1, idCategorie);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				categorie = new Categorie();
				categorie.setIdCategorie(rs.getInt("no_categorie"));
				categorie.setLibelle(rs.getString("libelle"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return categorie;
	}

}
