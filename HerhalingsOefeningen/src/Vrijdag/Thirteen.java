package Vrijdag;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Thirteen {
    public static void main(String[] args) {
        LocalDate[] fridays = new LocalDate[20];
        LocalDate[] daysbetween = new LocalDate[100000];
        LocalDate end = LocalDate.of(2080, 1, 1);
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate date = start;

        while (date.isBefore(end)) {
            LocalDate third = LocalDate.of(date.getYear(), date.getMonth(), 13);
            if (date.equals(third) && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(third);
            }
            date = date.plusDays(1);
        }
    }
}
