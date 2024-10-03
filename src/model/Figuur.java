package model;

/**
 * @author Vincent Velthuizen
 * Algemene eigenschappen van een Figuur
 */
public class Figuur {
    private static final String DEFAULT_KLEUR = "eggshell";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "een figuur is een verzameling punten";
    }

    public double geefOmtrek() {
        return 0;
    }

    public double geefOppervlakte() {
        return 0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein, en dat is NIET EERLIJK!!!";
        } else {
            return "Ja, ja, ik ben groot, sorry dat ik besta.";
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f", kleur, geefOmtrek(), geefOppervlakte());
    }
}
