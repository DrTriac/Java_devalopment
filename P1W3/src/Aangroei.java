import java.util.Scanner;
public class Aangroei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double aangroeiPercentage = 0;
        double beginBedrag = 0;
        double eindbedrag = 0;
        int aantalJaren = 0;
        boolean repeat = true;
        while(repeat)
        {
            System.out.print("geef het beginbedrag in");
            beginBedrag = scan.nextDouble();
            if (beginBedrag==0)
            {
                break;
            }
            System.out.print("geef het aangroeipercentage in");
            aangroeiPercentage = scan.nextDouble();
            System.out.print("geef het aantal jaren in");
            aantalJaren = scan.nextInt();
            for (int i = 1; i <= aantalJaren; i++) {
              eindbedrag = beginBedrag + ((beginBedrag/100)*aangroeiPercentage);
            }
            System.out.println(eindbedrag);
        }
    }
}
