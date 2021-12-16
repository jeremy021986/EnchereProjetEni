package fr.eni.enchere.dal.jdbc;
import fr.eni.enchere.bo.Retrait;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.RetraitDAO;

public class RetraitDAOJdbcImpl implements RetraitDAO {
	
	private static final String INSERT = "insert into RETRAITS (rue, code_postal, ville) values (?,?,?)";

	public RetraitDAOJdbcImpl() {
		
	}
	
	Retrait retrait = new Retrait();

    public  Retrait insert (Retrait retrait) throws BLLException {

        try (Connection cnx = ConnectionProvider.getConnection()) {
            PreparedStatement statement = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, retrait.getRue());
            statement.setString(2, retrait.getCodePostal());
            statement.setString(3, retrait.getVille());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next())
            {
                retrait.setIdRetrait(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
           
        }
        return retrait;
    }

}
