import java.util.Scanner;

public class Aangroei {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("geef het aantal jaar in ");
        int numberofyears = scanner.nextInt();
        System.out.print("geef het aantal inwoners in ");
        int inwooners = scanner.nextInt();
        System.out.print("geef het percentage in ");
        int percentage = scanner.nextInt();
        int newnumber;

        System.out.print("huidige aantal inwoorners: "+ inwooners + "\n");
        for (int i=0; i<=numberofyears; i++){
            newnumber = inwooners + ((inwooners/100)*percentage);

            if(i==0)
            {
                System.out.println("Aantal na 1 jaar " + newnumber);
            }
            else {
            System.out.println("Aantal na "+i+" jaren " + newnumber);
            inwooners = newnumber; }
        }



    }
}
