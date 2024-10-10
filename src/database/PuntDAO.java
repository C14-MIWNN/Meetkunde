package database;

import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Haal Punten uit en zet Punten in de database
 */
public class PuntDAO extends AbstractDAO {

    public PuntDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaPuntOp(Punt punt) {
        String sql = "INSERT INTO `Punt` VALUES (?, ?);";
        try {
            setupPreparedStatement(sql);
            getPreparedStatement().setDouble(1, punt.getxCoordinaat());
            getPreparedStatement().setDouble(2, punt.getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public ArrayList<Punt> geefAllePunten() {
        ArrayList<Punt> punten = new ArrayList<>();

        String sql = "SELECT xcoordinaat, ycoordinaat FROM `Punt`;";
        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");

                Punt punt = new Punt(xCoordinaat, yCoordinaat);
                punten.add(punt);
            }
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

        return punten;
    }
}
