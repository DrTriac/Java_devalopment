import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Dobbelen {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {
        int som = 0,res;
        System.out.println("hoe vaak wil je werpen?");
        int aantalworpen = scanner.nextInt();
        for (int i = 1; i <= aantalworpen; i++) {
            int dob1 = random.nextInt(1,6);
            int dob2 = random.nextInt(1,6);
            int dob3 = random.nextInt(1,6);
            res=dob1+dob2+dob3;
            System.out.println(dob1+ " + "+dob2+" + "+dob3 +" = " + res);
            som = som+res;
        }
        System.out.println("de som bedraagt: "+ som);
        System.out.println("het gemiddelde is: "+ som/aantalworpen);

    }
}
