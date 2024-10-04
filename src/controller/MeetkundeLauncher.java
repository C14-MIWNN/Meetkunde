package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Figuur[] mijnFiguurArray = new Figuur[4];

        mijnFiguurArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnFiguurArray[1] = new Rechthoek();
        mijnFiguurArray[2] = new Cirkel(6);

        for (int figuur = 0; figuur < mijnFiguurArray.length; figuur++) {
            toonInformatie(mijnFiguurArray[figuur]);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
