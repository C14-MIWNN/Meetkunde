package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();

        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);

        cirkelDAO.slaCirkelOp(new Cirkel(31, new Punt(4, 1), "magenta"));
        System.out.println(cirkelDAO.geefAlleCirkels());

        dBaccess.closeConnection();
    }

}
