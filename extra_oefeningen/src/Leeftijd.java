import java.util.Scanner;
import java.util.Date;

public class Leeftijd {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String voornaam;
        int leeftijd,geboortejaar;
        System.out.print("geef je voornaam in : ");
        voornaam = scanner.nextLine();
        System.out.print("geef je geboortejaar in : ");
        geboortejaar = scanner.nextInt();

        leeftijd = 2025 - geboortejaar;
        System.out.print(voornaam + " Proficiat, je wordt dit jaar: "+leeftijd);

    }
}
