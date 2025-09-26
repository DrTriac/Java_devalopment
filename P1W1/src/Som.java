import java.util.Scanner;

public class Som {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World");
        int getal1 = 0, getal2 = 0, som;
        System.out.println("Enter number 1");
        getal1 = scan.nextInt();

        System.out.println("Enter number 2");
        getal2 = scan.nextInt();

        som = getal1 + getal2;
        System.out.println(som);
    }
}
