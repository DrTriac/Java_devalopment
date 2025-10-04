import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int TOPPING = 50;
        final int PIZZA = 800;
        float totaalprijs = 0.0f;
        int aantaltoppings=0;

        float toppingprijs = (float) TOPPING /100;
        float pizzaprijs = (float) PIZZA /100;

        System.out.println("Hoeveel pizza's wil je");
        int aantalPizza=sc.nextInt();
        for (int i=1;i<=aantalPizza;i++) {
            System.out.println("hoeveel toppings wil je op pizza "+i);
            aantaltoppings=sc.nextInt();
            totaalprijs=totaalprijs+(toppingprijs*aantaltoppings);
        }
        totaalprijs = totaalprijs+(aantalPizza*pizzaprijs);
        System.out.println("je totaalprijs bedraagt:" + " €"+totaalprijs);
    }

}
