package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.UtilisateurDAO;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private final static String INSERT_USER = "INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, administrateur) VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_USER_BY_ID = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit FROM UTILISATEURS WHERE no_utilisateur=?";
	private static final String UPDATE_USER = "UPDATE UTILISATEURS SET pseudo= ?, email=?, telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=?, credit=? WHERE no_utilisateur=?";
	private static final String DELETE_USER = "DELETE FROM UTILISATEURS WHERE no_utilisateur=?";
	

	public UtilisateurDAOJdbcImpl() {

	}

	@Override // Création d'un nouvel utilisateur
	public void insert(Utilisateur ajoutUtilisateur) throws DALException {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			// Statement.RETURN_GENERATED_KEYS -> permet de r�cup�rer les cl�s primaires
			// g�n�r�es pendant la requ�te
			PreparedStatement pStmt = cnx.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
			pStmt.setString(1, ajoutUtilisateur.getPseudo());
			pStmt.setString(2, ajoutUtilisateur.getNom());
			pStmt.setString(3, ajoutUtilisateur.getPrenom());
			pStmt.setString(4, ajoutUtilisateur.getEmail());
			pStmt.setString(5, ajoutUtilisateur.getTelephone());
			pStmt.setString(6, ajoutUtilisateur.getRue());
			pStmt.setString(7, ajoutUtilisateur.getCodePostal());
			pStmt.setString(8, ajoutUtilisateur.getVille());
			pStmt.setString(9, ajoutUtilisateur.getMotDePasse());
			pStmt.setBoolean(10, ajoutUtilisateur.isAdministrateur());

			pStmt.executeUpdate();

			ResultSet rs = pStmt.getGeneratedKeys();
			if (rs.next()) {
				int idUtilisateur = rs.getInt(1); // 1 : premi�re colonne du r�sultat (qui n'en contient qu'une)
				ajoutUtilisateur.setIdUtilisateur(idUtilisateur);
			}

			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

	}

	@Override // Selection d'un utilisateur par son Id
	public Utilisateur selectById(int idUtilisateur) throws DALException {
		Utilisateur utilisateur = null;

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pStmt = cnx.prepareStatement(SELECT_USER_BY_ID);
			pStmt.setInt(1, idUtilisateur);

			pStmt.executeQuery();

			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

		return utilisateur;
	}

	@Override // Mise à jour d'un utilisateur
	public void update(Utilisateur MajUtilisateur) throws DALException {
		// TODO Auto-generated method stub
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pStmt = cnx.prepareStatement(UPDATE_USER);
			pStmt.setString(1, MajUtilisateur.getPseudo());
			pStmt.setString(2, MajUtilisateur.getNom());
			pStmt.setString(3, MajUtilisateur.getPrenom());
			pStmt.setString(4, MajUtilisateur.getEmail());
			pStmt.setString(5, MajUtilisateur.getTelephone());
			pStmt.setString(6, MajUtilisateur.getRue());
			pStmt.setString(7, MajUtilisateur.getCodePostal());
			pStmt.setString(8, MajUtilisateur.getVille());
			pStmt.setString(9, MajUtilisateur.getMotDePasse());

			pStmt.setInt(8, MajUtilisateur.getIdUtilisateur());

			pStmt.executeUpdate();

			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

	}

	@Override
	public void delete(int idUtilisateur) throws DALException {
		// Obtenir une connexion
		Connection cnx = ConnectionProvider.getConnection();

		// Obtient une objet de commande (Statement) = ordre SQL
		try {

			// Paramétrer l'objet de commande

			PreparedStatement pStmt = cnx.prepareStatement(DELETE_USER);

			pStmt.setInt(1, idUtilisateur);

			// Execute l'ordre SQL
			pStmt.executeUpdate();

			cnx.close();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

	}
}
