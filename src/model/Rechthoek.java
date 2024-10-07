package model;

/**
 * @author Vincent Velthuizen
 * Een rechthoek
 */
public class Rechthoek extends Figuur {
    private static final int DEFAULT_LENGTE = 0;
    private static final int DEFAULT_BREEDTE = 0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);

        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        super();

        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = new Punt();
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return this.lengte <= lengte && this.breedte <= breedte;
    }

    @Override
    public String toString() {
        return String.format("%s\nLengte: %.2f\nBreedte: %.2f\nHoekpuntLinksBoven: %s", super.toString(), this.lengte, this.breedte, this.hoekpuntLinksBoven);
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }
}
