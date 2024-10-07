package model;

import java.util.ArrayList;

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
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur past niet");
        }
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean past = false;

        if (figuur instanceof Rechthoek) {
            if (((Rechthoek) figuur).getLengte() <= lengte && ((Rechthoek) figuur).getBreedte() <= breedte) {
                past = true;
            }
        } else if (figuur instanceof Cirkel
                && ((Cirkel) figuur).getStraal() * 2 <= lengte
                && ((Cirkel) figuur).getStraal() * 2 <= breedte) {
            past = true;

        }


        return past;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("Mijn oppervlak bevat:");

        for (Figuur figuur : mijnFiguren) {
            returnString.append("\n\n").append(figuur.toString());
        }

        return returnString.toString();
    }
}
