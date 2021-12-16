package fr.eni.enchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.EnchereDAO;

public class EnchereDAOJdbcImpl implements EnchereDAO {

	private static final String SELECT_BY_NO_ARTICLE = "SELECT * FROM ENCHERES WHERE no_article= ?"	;
	
	private static final String INSERT_ENCHERE = "INSERT INTO ENCHERES(date_enchere, montant_enchere, no_article, no_utilisateur) VALUES(?,?,?,?)";
	
	private static final String UPDATE_ENCHERE = "UPDATE ENCHERES SET date_enchere = ?, montant_enchere = ?, no_utilisateur = ? WHERE no_article = ?";	
	
	public EnchereDAOJdbcImpl() {
		
	}

	
	public Enchere selectByArticle(int idArticle) throws DALException {
		Enchere enchere = null;
		LocalDateTime dateEnchere = null;
		int montantEnchere = 0;
		int idUtilisateur = 0;
		
		
		
		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pStmt = cnx.prepareStatement(SELECT_BY_NO_ARTICLE);
			pStmt.setInt(1, idArticle);

			ResultSet rs = pStmt.executeQuery();
			if (rs.next()) {
				enchere = map(rs);
			}
			
			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e.getMessage());
		}

		return enchere = new Enchere(dateEnchere, montantEnchere, idArticle, idUtilisateur);
	}
	
	
	
	public void insert(Enchere nouvelEnchere) throws DALException {
		
		
			try (Connection cnx = ConnectionProvider.getConnection()) {
				// Statement.RETURN_GENERATED_KEYS -> permet de r�cup�rer les cl�s primaires
				// g�n�r�es pendant la requ�te
				PreparedStatement pStmt = cnx.prepareStatement(INSERT_ENCHERE, Statement.RETURN_GENERATED_KEYS);
				pStmt.setTimestamp(1, Timestamp.valueOf(nouvelEnchere.getDateEnchere()));
				pStmt.setInt(2, nouvelEnchere.getMontantEnchere());
				pStmt.setInt(3, nouvelEnchere.getIdArticle());
				pStmt.setInt(4, nouvelEnchere.getIdUtilisateur());
			
				pStmt.executeUpdate();

				ResultSet rs = pStmt.getGeneratedKeys();
				if (rs.next()) {
					int noEnchere = rs.getInt(1); // 1 : premi�re colonne du résultat (qui n'en contient qu'une)
					nouvelEnchere.setIdUtilisateur(noEnchere);
				}
				
				cnx.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DALException(e.getMessage());
			}

	}

	
	public void update(Enchere nouvelEnchere) throws DALException {
		
		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement statement = cnx.prepareStatement(UPDATE_ENCHERE);

		
			statement.setTimestamp(1, Timestamp.valueOf(nouvelEnchere.getDateEnchere()));
			statement.setInt(2, nouvelEnchere.getMontantEnchere());
			statement.setInt(3, nouvelEnchere.getIdUtilisateur());
			statement.setInt(4, nouvelEnchere.getIdArticle());
			
			
			
			statement.executeUpdate();
			
			cnx.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
		
	
	private Enchere map(ResultSet rs) throws SQLException {
		Enchere enchere = null;
		LocalDateTime dateEnchere = rs.getTimestamp("date_enchere").toLocalDateTime();
		int montantEnchere = rs.getInt("montant_enchere");
		int idArticle = rs.getInt("no_article");
		int idUtilisateur = rs.getInt("no_utilisateur");
	

		enchere = new Enchere(dateEnchere, montantEnchere, idArticle, idUtilisateur);
		// TODO verif conversion date
		return enchere;
	

	}

}
