import java.util.Scanner;

public class Cijfers2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("geef een cijfer in tussen 1000 en 9999");
            String cijfer = scanner.nextLine();
            int som=0;
            int cijferI = Integer.parseInt(cijfer);
            while (cijferI < 1000 || cijferI > 9999) {
                System.out.println("geef een cijfer in tussen 1000 en 9999");
                cijfer = scanner.nextLine();
                cijferI = Integer.parseInt(cijfer);
            }
                int cijfer1, cijfer2, cijfer3,cijfer4;
                cijfer1 = cijfer.charAt(0) - '0';
                cijfer2 = cijfer.charAt(1)-'0';
                cijfer3 = cijfer.charAt(2)-'0';
                cijfer4 = cijfer.charAt(3)-'0';


            som=cijfer1+cijfer2+cijfer3+cijfer4;;
            System.out.println(som);
        }
    }
}
