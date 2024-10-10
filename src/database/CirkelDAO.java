package database;

import model.Cirkel;
import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Haal Cirkels uit en zet Cirkels in de database
 */
public class CirkelDAO extends FiguurDAO {

    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        int figuurnummer = slaFiguurOp(cirkel);

        String sql = "INSERT INTO `Cirkel` (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            setupPreparedStatement(sql);
            getPreparedStatement().setInt(1, figuurnummer);
            getPreparedStatement().setDouble(2, cirkel.getStraal());
            getPreparedStatement().setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            getPreparedStatement().setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());

            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public ArrayList<Cirkel> geefAlleCirkels() {
        ArrayList<Cirkel> cirkels = new ArrayList<>();

        String sql =    "SELECT straal, xcoordinaat, ycoordinaat, kleur " +
                        "FROM `Cirkel` " +
                        "   JOIN `Figuur` " +
                        "   ON `Cirkel`.figuurnummer = `Figuur`.figuurnummer;";

        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                double straal = resultSet.getDouble("straal");
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");
                String kleur = resultSet.getString("kleur");

                cirkels.add(new Cirkel(straal, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

        return cirkels;
    }
}
