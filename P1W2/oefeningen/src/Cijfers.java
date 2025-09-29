import java.util.Scanner;

public class Cijfers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String cijfer1, cijfer2, cijfer3, cijfer4;

        while (true) {
            System.out.println("geef een cijfer in tussen 1 en 9");
            cijfer1 = scanner.nextLine();
            if (cijfer1.equals("-1")) {
                break;
            }
            System.out.println("geef een cijfer in tussen 1 en 9");
            cijfer2 = scanner.nextLine();
            System.out.println("geef een cijfer in tussen 1 en 9");
            cijfer3 = scanner.nextLine();
            System.out.println("geef een cijfer in tussen 1 en 9");
            cijfer4 = scanner.nextLine();

            System.out.println("je cijfer is: "+cijfer1 + cijfer2 + cijfer3 + cijfer4);

        }

    }
}
