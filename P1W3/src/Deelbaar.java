import java.util.Scanner;
import java.util.ArrayList;
public class Deelbaar {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       ArrayList<Integer> getallen = new ArrayList<Integer>(); // Create an ArrayList object
      boolean repeat = true;

       while (true)
       {
           System.out.println("geef een eerste deler in");
           int getal1 = scan.nextInt();
           if (getal1 == 0) break;
           System.out.println("geef een tweede in");
           int getal2 = scan.nextInt();

           for (int i = 1 ; i < 1000 ; i++) {
               if(i%getal1==0 && i%getal2==0) {
                   getallen.add(i);
               }
           }

           for (int i = 0; i < getallen.size(); i++) {
               System.out.print(getallen.get(i) + "\t");
               if (i%10==0) {
                   System.out.println();
               }


           }
           System.out.println();
           getallen.clear();
       }
    }
}
