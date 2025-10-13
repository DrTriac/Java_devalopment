import java.util.Scanner;
public class Getallen_formateren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("geef eeb getal in van 6 cijfers \n");
        int getal = sc.nextInt();
        String getalS = ""+getal;
        String formatted = String.format("%,d", getal);
        formatted = formatted.replace("."," ");
        System.out.printf(formatted);



        }
    }

