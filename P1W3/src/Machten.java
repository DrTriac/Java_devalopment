import java.util.Scanner;
public class Machten {
    public static void main(String[] args) {
        final int MAX = 10000;
        double product = 0;
        double aantal = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("geef het getal in waarvan je de machten wilt");
        int getal = sc.nextInt();

        while(product<MAX){
            product = Math.pow(getal,aantal);
            if(product>MAX){
                break;
            }
            aantal++;
            System.out.println((int) product);
        }


    }
}
