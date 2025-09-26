import java.util.Scanner;

public class Bewerkingen {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the first number");
        int a =  scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        System.out.println("kies een bewerking");
        System.out.println("\t"+"1. Optellen");
        System.out.println("\t"+"2. Afrekken");
        System.out.println("\t"+"3. vermenigvuldigen");
        System.out.println("\t"+"4. Delen");
        System.out.println("\t"+"5. Machtsverheffing");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a^b);
        }

    }
}
