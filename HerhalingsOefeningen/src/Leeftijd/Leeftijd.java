package Leeftijd;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Leeftijd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int day, month, year;
        System.out.println("geef je gerboortedag in");
        day = s.nextInt();
        System.out.println("geef je gerboortemaand in");
        month = s.nextInt();
        System.out.println("geef je gerboortejaar in");
        year = s.nextInt();
        LocalDate birthday = LocalDate.of(year,month,day);
        int daysSince = Period.between(birthday,LocalDate.now()).getDays();
        int monthsSince = Period.between(birthday,LocalDate.now()).getMonths();
        int yearsSince = Period.between(birthday,LocalDate.now()).getYears();

        System.out.format("je leeft al %s dagen, %s maanden en %s jaren",daysSince,monthsSince,yearsSince);
        System.out.format("je bent geboren op een %S",birthday.getDayOfWeek());

    }
}
