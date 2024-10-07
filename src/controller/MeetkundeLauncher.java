package controller;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(20, 30);
        oppervlak.voegFiguurToe(new Cirkel());
        oppervlak.voegFiguurToe(new Rechthoek());
        oppervlak.voegFiguurToe(new Cirkel(11));
        oppervlak.voegFiguurToe(new Rechthoek(30, 10));
        oppervlak.voegFiguurToe(new Cirkel(3));

        System.out.println(oppervlak);
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
