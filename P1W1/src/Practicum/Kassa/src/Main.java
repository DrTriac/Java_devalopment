import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aantal kinderen <1m:");
        int kidsKleinerDanMeter = scanner.nextInt();

        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        int kidsTussen1En140 = scanner.nextInt();

        System.out.print("Aantal volwassenen: ");
        int volwassenen = scanner.nextInt();

        System.out.print("Aantal senioren (55+): ");
        int senioren = scanner.nextInt();

        System.out.println("*******************************\n" +
                "* Welkom in het pretpark! *\n" +
                "*******************************");
        // bereken de volledige prijs
        double vollePrijs = kidsTussen1En140 * 26 + volwassenen * 31 + senioren * 15.5;

        double groepsKorting = 0.0;
        double seniorenKorting = 0.0;

        if (kidsTussen1En140 + volwassenen + senioren >= 10) {
            groepsKorting = (vollePrijs * .10);
        }

        if ((senioren > 1) && (kidsTussen1En140 > 0)) {
            seniorenKorting = kidsTussen1En140 * 26.0 / 2.0;
        }

        // toon de prijs, afgerond op 2 cijfers na de komma
        System.out.format("* Prijs: %.2f EUR\n", vollePrijs);

        if (groepsKorting > 0) {
            System.out.format("* Groepskorting: %.2f EUR\n", groepsKorting);
        }
        if (seniorenKorting > 0) {
            System.out.format("* Seniorenkorting: %.2f EUR\n", seniorenKorting);
        }

        // bereken de prijs met korting
        double prijs = vollePrijs;
        if (groepsKorting > seniorenKorting) {
            prijs = prijs - groepsKorting;
        }
        else {
            prijs = prijs - seniorenKorting;
        }

        // toon de prijs
        System.out.format("* Totaal: %.2f EUR\n", prijs);

//        System.out.format("* Totaal: %.1f EUR\n", vollePrijs - Double.max(groepsKorting, seniorenKorting));
        System.out.println("**************************************");
    }
}