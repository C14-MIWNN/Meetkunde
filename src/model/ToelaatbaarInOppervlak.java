package model;

/**
 * @author Vincent Velthuizen
 * Dit object kan bepalen of het op een oppervlak past
 */
public interface ToelaatbaarInOppervlak {
    boolean pastInOppervlak(double lengte, double breedte);
}
