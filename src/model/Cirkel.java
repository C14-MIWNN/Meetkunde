package model;

/**
 * @author Vincent Velthuizen
 * Een cirkel
 */
public class Cirkel extends Figuur {
    private static final int DEFAULT_STRAAL = 1;

    private double straal;
    private final Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);

        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        super();

        setStraal(straal);
        this.middelpunt = new Punt();
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return 2 * straal <= lengte && 2 * straal <= breedte;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            straal = DEFAULT_STRAAL;
            System.out.println("Ja sorry, maar dat gaan we dus mooi niet doen...");
        }
        this.straal = straal;
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %.2f\nMiddelpunt: %s", super.toString(), straal, middelpunt);
    }

    public double getStraal() {
        return straal;
    }
}
