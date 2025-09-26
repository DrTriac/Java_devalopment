import java.util.Scanner;

public class BMI {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String voornaam="";
        float gewicht,Bmi, lengte;
        int leeftrijd;
        System.out.println("voornaam");
        voornaam = scanner.nextLine();
        System.out.println("Gewicht:");
        gewicht = scanner.nextFloat();
        System.out.println("Lengte:");
        lengte = scanner.nextFloat();
        Bmi = lengte/gewicht;

        Bmi= gewicht/(lengte*lengte);

        if(Bmi <= 18.5)
        {
            System.out.println("ondergewicht");
        } else if (Bmi <= 24.9) {
            System.out.println("uw BMI bedraagt:"+Bmi+" normaal");
        } else if (Bmi<= 30) {
            System.out.println("uw BMI bedraagt:"+Bmi+" zwaarlijvend");
        } else if (Bmi >=40) {
            System.out.println("uw BMI bedraagt:"+Bmi+" overgewicht");
        }
    }
}
