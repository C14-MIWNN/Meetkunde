package model;

/**
 * @author Vincent Velthuizen
 * Een cirkel
 */
public class Cirkel {
    private static final int DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "zwart";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static int aantalCirkels = 0;

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        setStraal(straal);
        this.middelpunt = middelpunt;
        this.kleur = kleur;

        aantalCirkels++;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
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

    public String vertelOverGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein, en dat is NIET EERLIJK!!!";
        } else {
            return "Ja, ja, ik ben groot, sorry dat ik besta.";
        }
    }

    public static int getAantalCirkels() {
        return aantalCirkels;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            straal = DEFAULT_STRAAL;
            System.out.println("Ja sorry, maar dat gaan we dus mooi niet doen...");
        }
        this.straal = straal;
    }
}
