package model;

/**
 * @author Vincent Velthuizen
 * Een rechthoek
 */
public class Rechthoek {
    private static final String DEFAULT_KLEUR = "lila";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private static final int DEFAULT_LENGTE = 0;
    private static final int DEFAULT_BREEDTE = 0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULT_KLEUR);
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein, en dat is NIET EERLIJK!!!";
        } else {
            return "Ja, ja, ik ben groot, sorry dat ik besta.";
        }
    }
}
