package database;

import model.Figuur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 */
public class FiguurDAO extends AbstractDAO {
    public FiguurDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    protected int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO `Figuur` (kleur) VALUES (?);";
        int primaryKey = -1;

        try {
            setupPreparedStatementWithKey(sql);
            getPreparedStatement().setString(1, figuur.getKleur());
            primaryKey = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

        return primaryKey;
    }
}
