import java.util.Scanner;

public class Sommeren {
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum=0;
        int a=scanner.nextInt();
        while(a!=0)
        {
            sum = sum+a;
            a = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
