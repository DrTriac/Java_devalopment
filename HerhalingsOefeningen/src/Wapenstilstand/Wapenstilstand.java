
package Wapenstilstand;
import java.time.*;
import java.util.Date;


public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate armistice = LocalDate.of(1918,11,11);
        DayOfWeek armiDay =  armistice.getDayOfWeek();

        String s=" ";
        switch (armiDay){
            case MONDAY ->s= "Maandag";
            case TUESDAY -> s= "Dinsdag";
            case WEDNESDAY -> s="Woensdag";
            case THURSDAY -> s="Donderdag";
            case FRIDAY -> s="Friday";
            case SATURDAY -> s="Zaterdag";
            case SUNDAY -> s="Zondag";
        }
        System.out.println("wapenstilstand (11 november 1918) viel op een: "+s);

        int[] sundayYears = new int[9];
        int index = 0;

        for (int year = 1980; year<=2040 && index < sundayYears.length;)
        {
            LocalDate date = LocalDate.of(year, 11,11);
            if(date.getDayOfWeek() == DayOfWeek.SUNDAY)
            {
                sundayYears[index++] = date.getYear();
            }
            year++;
        }

        for(int y : sundayYears)
        {
            System.out.print(y+" ");
        }


    }

}
