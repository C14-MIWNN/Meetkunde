package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.printf("Omtrek: %.2f\nOppervlakte: %.2f\n%s\n\n",
                    mijnCirkelArray[cirkel].geefOmtrek(),
                    mijnCirkelArray[cirkel].geefOppervlakte(),
                    mijnCirkelArray[cirkel].vertelOverGrootte());
        }

    }

}
