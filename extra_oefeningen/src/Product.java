import java.util.Scanner;

public class Product {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c;
        System.out.println("A:");
        a=scanner.nextInt();
        System.out.println("B:");
        b=scanner.nextInt();
        System.out.println("C:");
        c=scanner.nextInt();

        System.out.println(a*b*c);
    }
}
