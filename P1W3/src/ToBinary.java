import java.util.Scanner;
public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFirst = true;

        while (true){
            System.out.println("enter a number");
            int getal =  sc.nextInt();
            if(getal==0){ break;}
            String binary = Integer.toBinaryString(getal);
            System.out.println("Binary form: " + binary);
        }




    }
}
