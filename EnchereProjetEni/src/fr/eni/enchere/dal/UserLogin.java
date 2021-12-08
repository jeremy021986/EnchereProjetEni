package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.enchere.bo.Utilisateur;

public class UserLogin {

	public Utilisateur checkLogin(String email, String mot_de_passe) throws SQLException,ClassNotFoundException {
		String jdbcURL = "jdbc:sqlserver://10.102.200.41:1433;databasename=MAVERICK_TEST_ENCHERES";
		String dbUser = "sa";
		String dbPassword = "Pa$$word";
	 
		Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
			String sql = "SELECT * FROM UTILISATEURS WHERE email = ? and mot_de_passe = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, mot_de_passe);
			 
		ResultSet result = statement.executeQuery();
			 
		Utilisateur utilisateur = null;
	 
		if (result.next()) {
			utilisateur = new Utilisateur();
			utilisateur.setPrenom(result.getString("Prénom"));
			utilisateur.setEmail(email);
		}
	 
		connection.close();
			 
		return utilisateur;
	}
	
	
}
