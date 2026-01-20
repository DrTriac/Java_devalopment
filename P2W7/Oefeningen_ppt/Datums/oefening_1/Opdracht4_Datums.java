package oefening_1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Opdracht4_Datums {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        LocalDateTime today = LocalDateTime.now();
        System.out.format("het is vandaag: %s\n",f.format(today));
        LocalDate vandaag = LocalDate.now();
        LocalDate dan = LocalDate.of(2067, 7,22);
        Period tijdsduur = Period.between(vandaag,dan);
        long daysBetween = ChronoUnit.DAYS.between(vandaag, dan);
        System.out.format("het is nog %s dagen voor je 67ste verjaardag",daysBetween);

        //schrikkeljaarteller
        LocalDate old = LocalDate.of(1945,1,1);
        LocalDate New = LocalDate.of(2045,1,1);
        LocalDate i;
        for(i = old; i.isBefore(New); i = i.plusYears(1))
        {
            if (i.isLeapYear())
            {
                System.out.println(i.getYear());
            }
        }

        LocalDateTime oldDate = LocalDateTime.of(2000,1,1,0,0);
        LocalDateTime newdate = LocalDateTime.now();
        long secondsbetween = ChronoUnit.SECONDS.between(oldDate,newdate);
        System.out.println(secondsbetween);
        System.out.println(ChronoUnit.MONTHS.between(oldDate,newdate));
    }
}
