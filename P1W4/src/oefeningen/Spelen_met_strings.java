import java.util.Scanner;
public class Spelen_met_strings {
    public static void main(String[] args) {
        int aantalspaties = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("geef een zin in");
        String zin = sc.nextLine();
        System.out.printf("%s %d karakters in de zin","er zijn",zin.length());
        System.out.printf("\n"+zin.toUpperCase());
        System.out .println("\n"+zin.toLowerCase());
        System.out.printf("%s %c", "het eerste karakter is een: ", zin.charAt(0));
        for (int i = 1; i < zin.length(); i++) {
            if (zin.charAt(i) == ' ') {
                aantalspaties++;
            }
        }
        System.out.println(" ");
        System.out.printf("er zijn: %d karakters, spaties niet meegeteld \n",zin.length()-aantalspaties);
        System.out.printf("%s \n",zin.replaceAll("e","_"));
        System.out.printf(zin.replaceAll(" ",""));
        

    }
}
