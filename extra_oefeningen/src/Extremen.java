import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Extremen {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number=0, greatestnumber = 0;
        ArrayList<Integer> listofnumbers  = new ArrayList();
        while (number != -1) {
            number = scanner.nextInt();
            listofnumbers.add(number);
        }

        for(int i =0; i<listofnumbers.size();i++){
            if (listofnumbers.get(i) > greatestnumber) {
                greatestnumber = listofnumbers.get(i);
            }
        }
        System.out.print(greatestnumber);
        System.out.print("\n"+"aantal ingegeven getallen is: " + listofnumbers.size() + "\n" + "einde programma");
    }
}
