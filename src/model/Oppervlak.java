package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Vincent Velthuizen
 * Oppervlak waar ik figuren op kan plakken.
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuur.pastInOppervlak(lengte, breedte)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur past niet");
        }
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("Mijn oppervlak bevat:");

        Collections.sort(mijnFiguren);
        for (Figuur figuur : mijnFiguren) {
            returnString.append("\n\n").append(figuur.toString());
        }

        return returnString.toString();
    }
}
