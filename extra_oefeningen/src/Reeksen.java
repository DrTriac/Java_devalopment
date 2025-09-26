import java.util.Scanner;

public class Reeksen {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("aantal");
        int a = scanner.nextInt();
        System.out.print("start");
        int b = scanner.nextInt();
        System.out.print("stap");
        int c = scanner.nextInt();

        for (int i=0; i<a; i++)
        {
            System.out.println(b);
            b = b+c;
        }
    }
}
