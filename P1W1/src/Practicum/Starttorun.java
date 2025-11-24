import java.util.Scanner;
public class Starttorun
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.\n");
        System.out.printf("geef je leeftijd in\n");
        int leeftijd = input.nextInt();
        int hartslagMax = 220 - leeftijd;
        System.out.printf("geef je hartslag in rust in\n");
        int rust = input.nextInt();
        System.out.printf("welke spport training wil je doen?\n");
        System.out.printf(" 1 : recuperatie training\n 2 : LSD training (Long Slow Distance)\n 3 : extensieve uithouding\n 4 : intensieve uithouding\n 5 : tempo-interval\n 6 : intensieve interval\n");
        int typeTraining = input.nextInt();
        int uithoudingspercentage = 0;

        switch  (typeTraining) {

            case 1: uithoudingspercentage = 65;
                break;
            case 2: uithoudingspercentage = 70;
                break;
            case 3: uithoudingspercentage = 75;
                break;
            case 4: uithoudingspercentage = 85;
                break;
            case 5: uithoudingspercentage = 90;
                break;
            case 6: uithoudingspercentage = 95;
                break;
        }

        //System.out.printf("%.2f",uithoudingspercentage);
        int hartslagIdeaal = rust + (hartslagMax - rust) * (uithoudingspercentage/100);
        System.out.printf("%s %d %s","je maximale hartslag is: ", hartslagMax,"\n");
        System.out.printf("%s %d","je traint best met een hartslag van: ",hartslagIdeaal);



    }


}