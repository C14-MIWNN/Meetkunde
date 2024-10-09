package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(10, 5);
        try (Scanner rechthoekenScanner = new Scanner(new File("resources/rechthoeken.csv"))) {

            while (rechthoekenScanner.hasNextLine()) {
                String[] rechthoekElementen = rechthoekenScanner.nextLine().split(",");

                double lengte = Double.parseDouble(rechthoekElementen[0]);
                double breedte = Double.parseDouble(rechthoekElementen[1]);
                double xCoordinaat = Double.parseDouble(rechthoekElementen[2]);
                double yCoordinaat = Double.parseDouble(rechthoekElementen[3]);
                String kleur = rechthoekElementen[4];

                Punt punt = new Punt(xCoordinaat, yCoordinaat);
                Rechthoek rechthoek = new Rechthoek(lengte, breedte, punt, kleur);
                oppervlak.voegFiguurToe(rechthoek);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Het opgegeven bestand is niet beschikbaar.");
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
