import java.util.Scanner;

public class Middelste {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        System.out.println("enter the third number");
        int c = scanner.nextInt();
        int middelnumber = 0;

        //variable = (condition) ? expressionTrue :  expressionFalse;

        if ((a > b && a < c) || (a < b && a > c)) {
            middelnumber = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            middelnumber = b;
        } else {
            middelnumber = c;
        }


        System.out.println(middelnumber);

    }
}