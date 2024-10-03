package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.printf("Omtrek: %.2f\nOppervlakte: %.2f\n%s\n\n",
                    mijnCirkelArray[cirkel].geefOmtrek(),
                    mijnCirkelArray[cirkel].geefOppervlakte(),
                    mijnCirkelArray[cirkel].vertelOverGrootte());
        }

        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];

        mijnRechthoekArray[0] = new Rechthoek();
        mijnRechthoekArray[1] = new Rechthoek(4, 5);
        mijnRechthoekArray[2] = new Rechthoek(12, 11, new Punt(4, 1), "geel");

        for (int rechthoek = 0; rechthoek < mijnRechthoekArray.length; rechthoek++) {
            System.out.printf("Omtrek: %.2f\nOppervlakte: %.2f\n%s\n\n",
                    mijnRechthoekArray[rechthoek].geefOmtrek(),
                    mijnRechthoekArray[rechthoek].geefOppervlakte(),
                    mijnRechthoekArray[rechthoek].vertelOverGrootte());
        }
    }

}
