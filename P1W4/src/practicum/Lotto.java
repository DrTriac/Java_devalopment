import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;
import java.time.LocalDate;
public class Lotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate d1 = LocalDate.now();
        System.out.printf("welkom bij de lottotrekking van: " + d1);
        System.out.printf("geef je volledige naam in");
        String naam = scan.nextLine();
        StringBuilder initialen = new StringBuilder();



        if (!naam.isEmpty())
        {
            initialen.append(naam.charAt(0)).append('.');

        }

        for (int i = 0; i < naam.length() ; i++) {

            if (naam.charAt(i) == ' ')
            {
                initialen.append(naam.charAt(i + 1)).append('.');
            }
        }
        int getal;
        System.out.printf("welkom %s \n", initialen.toString());
        RandomGenerator randomGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            getal = randomGenerator.nextInt(1,50);
            System.out.printf("%-5d",getal);
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            getal = randomGenerator.nextInt(1,30)*2;
            System.out.printf("%-10d",getal);
        }

    }
}
