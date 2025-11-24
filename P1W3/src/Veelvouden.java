import java.util.Scanner;
public class Veelvouden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int som = 0;
        System.out.println("geef een getal waarvan je de veelvouden tot 100 wilt");
        int getal = sc.nextInt();
        while (som+getal < MAX) {
            som = som + getal;
            System.out.println(som);
        }


    }
}