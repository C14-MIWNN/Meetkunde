package controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 */
public class LocalDateLauncher {

    public static void main(String[] args) {
        LocalDate dezeDag = LocalDate.now();
        LocalTime dezeTijd = LocalTime.now();
        LocalDateTime nu = LocalDateTime.now();

        System.out.println(dezeDag);
        System.out.println(dezeTijd);
        System.out.println(nu);

        LocalDate begin2024 = LocalDate.parse("2024-01-01");
        System.out.println(begin2024.getDayOfMonth());
        System.out.println(begin2024.getDayOfWeek());
        System.out.println(begin2024.getMonth().toString().toLowerCase());
        System.out.println(begin2024.getMonthValue());

        LocalDate verjaardag = LocalDate.of(1988, 2, 27);
        if(verjaardag.isAfter(dezeDag)) {
            System.out.println("Je verjaardag is nog niet geweest");
        } else {
            System.out.println("Je bent nog lang niet jarig");
        }

        int maandenTotVerjaardag = Period.between(dezeDag, verjaardag).getMonths();
        System.out.printf("Nog %d maanden tot je weer jarig bent\n", maandenTotVerjaardag);
    }
}
