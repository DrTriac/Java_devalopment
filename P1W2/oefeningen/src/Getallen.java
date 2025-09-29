import java.util.Scanner;

public class Getallen
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        final int MINIMUN = 100000;
        final int MAXIMUN = 999999;

        System.out.println("geef een getal in van 6 cijfers");
        long cijfer1= sc.nextInt();
        System.out.println("geef een getal in van 6 cijfers");
        long cijfer2= sc.nextInt();

        while ((cijfer1 < MINIMUN || cijfer1 > MAXIMUN)&&(cijfer2 < MINIMUN || cijfer2 > MAXIMUN))
        {
            System.out.println("geef een getal in van 6 cijfers");
            cijfer1= sc.nextInt();
            System.out.println("geef een getal in van 6 cijfers");
            cijfer2= sc.nextInt();
        }
        long product = cijfer1*cijfer2;
        System.out.println("product is: "+product);
        String productL = Long.toString(product);
        char getal1,getal2,getal3,getal4,getal5;
        getal5=productL.charAt(productL.length()-5);
        getal4=productL.charAt(productL.length()-4);
        getal3=productL.charAt(productL.length()-3);
        getal2=productL.charAt(productL.length()-2);
        getal1=productL.charAt(productL.length()-1);
        System.out.println("de laatste 5 cijfers zijn:"+getal5+getal4+getal3+getal2+getal1);

    }


}
