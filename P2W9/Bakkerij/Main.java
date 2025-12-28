package Bakkerij;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
// Maak een nieuwe bakkerij aan
        Bakkerij bakkerij = new Bakkerij();
// ==== Producten aanmaken als Product-referenties ====
        Product product1 = new CinnamonRoll("Classic Roll", 2.0,
                Topping.KARAMEL, LocalDate.of(2025, 12, 2));
        Product product2 = new CinnamonRoll("Choco Roll", 2.5,
                Topping.CHOCOLADE, LocalDate.of(2025, 12, 4));
        Product product3 = new CinnamonRoll("Cinnamon Twist", 2.2,
                Topping.KANEEL, LocalDate.of(2025, 12, 3));
        Product product4 = new CinnamonRoll("Double Choco Roll", 3.0,
                Topping.CHOCOLADE, LocalDate.of(2025, 12, 5));
        Product product5 = new CinnamonRoll("Caramel Delight", 2.8,
                Topping.KARAMEL, LocalDate.of(2025, 12, 6));
        Product product6 = new Koffie("Espresso", 2.5, LocalDate.of(2025,
                12, 5), true);
        Product product7 = new Koffie("Latte", 3.0, LocalDate.of(2025, 12,
                3), false);
        Product product8 = new Koffie("Cappuccino", 3.2, LocalDate.of(2025,
                12, 6), true);
        Product product9 = new Koffie("Americano", 2.0, LocalDate.of(2025,
                12, 4), false);
// ==== Voeg alle producten toe aan de bakkerij ====
        bakkerij.voegProductToe(product1);
        bakkerij.voegProductToe(product2);
        bakkerij.voegProductToe(product3);
        bakkerij.voegProductToe(product4);
        bakkerij.voegProductToe(product5);
        bakkerij.voegProductToe(product6);
        bakkerij.voegProductToe(product7);
        bakkerij.voegProductToe(product8);
// ==== Print de inhoud van de bakkerij ====
        System.out.println("=== Inhoud van de Bakkerij ===");
        System.out.println(bakkerij);
// ==== Toon totaal aantal aangemaakte producten ====
        System.out.println("Er zijn in totaal " + Product.getTotaalProducten() +
                " producten aangemaakt.");
// ==== Toon totaal aantal producten van de bakkerij ====
        System.out.println("Er zijn in totaal " + bakkerij.getAantal() + "producten in de bakkerij.");
    }
}
