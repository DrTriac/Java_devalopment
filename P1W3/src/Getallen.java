public class Getallen {
    public static void main(String[] args) {
        int getal = -10;
        char teken;
        for (int i = getal; i <= 10; i++) {
            teken = (i > 0) ? '+' : ' ';
            System.out.print(teken);
            System.out.print(i);
        }
    }
}
