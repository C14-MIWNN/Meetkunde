package controller;

import model.*;

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
        Scanner toetsenbord = new Scanner(System.in);
        Cirkel cirkel = null;

        while (cirkel == null) {
            System.out.print("Geef de straal van de cirkel: ");

            try {
                double straal = toetsenbord.nextDouble();
                cirkel = new Cirkel(straal);
            } catch (IllegalArgumentException illegalArgumentException)  {
                System.err.println(illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                toetsenbord.nextLine();
                System.err.println("Hoe dom kun je zijn? Wat kun je wel? Wat is dit!?!?!?! ");
            } finally {
                System.out.println("Of het nu lukt of niet je krijgt dit te zien");
            }
        }

        System.out.println(cirkel);
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
