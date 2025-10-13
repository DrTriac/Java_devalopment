import java.util.Scanner;
public class Koortsmeetsysteemstrook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("geef een woord in");
        String woord = sc.nextLine();
        StringBuilder woordSb = new StringBuilder(woord);
        StringBuilder reversed = woordSb.reverse();
        String reversedS =  reversed.toString();
        if(woord.equals(reversedS)){
            System.out.println(woord + " is een palindroom");
        } else {System.out.printf(woord +" is geen palindroom");}
    }
}
