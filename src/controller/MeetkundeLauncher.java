package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Cirkel.aantalCirkels);
        Cirkel mijnCirkel = new Cirkel();
        System.out.println(mijnCirkel.aantalCirkels);
        Cirkel mijnTweedeCirkel = new Cirkel(3, 1, 4, "paars");
        System.out.println(mijnCirkel.aantalCirkels);
        Cirkel mijnDerdeCirkel = new Cirkel(6);
        System.out.println(mijnCirkel.aantalCirkels);

        System.out.println(mijnCirkel.geefOmtrek());
        System.out.println(mijnTweedeCirkel.geefOmtrek());
        System.out.println(mijnDerdeCirkel.geefOmtrek());
    }

}
