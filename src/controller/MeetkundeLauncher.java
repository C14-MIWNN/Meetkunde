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

        Oppervlak oppervlak = new Oppervlak(20, 30);
        try (Scanner stralenScanner = new Scanner(new File("resources/stralen.txt"))) {

            while (stralenScanner.hasNextDouble()) {
                double straal = stralenScanner.nextDouble();

                try {
                    oppervlak.voegFiguurToe(new Cirkel(straal));
                } catch (IllegalArgumentException illegalArgumentException) {
                    System.out.println(illegalArgumentException.getMessage());
                    System.out.println("De betrokken straal wordt overgeslagen.");
                }
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
