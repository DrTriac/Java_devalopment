import java.util.Scanner;

public class Omwisselen {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int a,b,c;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();


        c=a;
        a=b;
        b=c;

        System.out.print("A: "+a + "\n");
        System.out.print("B: "+b);


    }


}
