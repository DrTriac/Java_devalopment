import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maand,jaar;
        String[] maanden = {"Januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "october", "november", "december"};
        int[] aantaldagen = {31,28,31,30,31,30,31,30,31,30,30,31};
        boolean isSchrikkeljaar = false;
        System.out.print("geef een maand in (1-12)");
        maand = sc.nextInt();
        while(maand<1 || maand>12){
            System.out.println("geef een maand in (1-12)");
            maand = sc.nextInt();
        }
        System.out.print("geef een jaar in");
        jaar = sc.nextInt();
        while(jaar<0 || jaar>9999){
            System.out.println("geef een jaar in");
            jaar = sc.nextInt();
        }
        if ((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
            isSchrikkeljaar = true;
            aantaldagen[1] = 29;
        }
        System.out.print("in het jaar "+ jaar+ " telt "+ maanden[maand - 1] + " " + aantaldagen[maand -1] + " dagen");

    }
}
