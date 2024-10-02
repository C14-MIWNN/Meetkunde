package model;

/**
 * @author Vincent Velthuizen
 * Een cirkel
 */
public class Cirkel {
    private static final int DEFAULT_STRAAL = 1;
    private static final int DEFAULT_MIDDELPUNT_X = 0;
    private static final int DEFAULT_MIDDELPUNT_Y = 0;
    private static final String DEFAULT_KLEUR = "zwart";

    public static int aantalCirkels = 0;

    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;

        aantalCirkels++;
    }

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = DEFAULT_KLEUR;

        aantalCirkels++;
    }

    public Cirkel(String kleur) {
        this.straal = DEFAULT_STRAAL;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = kleur;

        aantalCirkels++;
    }

    public Cirkel() {
        this.straal = DEFAULT_STRAAL;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = DEFAULT_KLEUR;

        aantalCirkels++;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
