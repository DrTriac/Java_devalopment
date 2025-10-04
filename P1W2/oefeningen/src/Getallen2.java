import  java.util.Scanner;

public class Getallen2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long getal1 = 0,getal2=0;
        float quotient=0;
        while(getal1<=1000000000000L&& getal1<=9999999999999L)
        {

            System.out.println("geef een geheel getal in van 13 cijfers");
            getal1 = sc.nextLong();
        }
        while(getal2<=10000000L&&getal2<=99999999L)
        {
            System.out.println("geef een geheel getal in van 8 cijfers");
            getal2 = sc.nextLong();
        }
        float getal1F=((float) getal1);
        float getal2F=((float) getal2);
        quotient=getal1F/getal2F;
        int quotientI = Math.round(quotient);
        System.out.println(quotient);
        System.out.println(quotientI);



}
}
