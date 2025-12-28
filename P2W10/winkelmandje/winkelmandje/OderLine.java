package winkelmandje;

public class OderLine {

    private int amount;     // Het aantal exemplaren van het item in deze orderline
    private Item item;      // Het item zelf (kan een Book of Movie zijn)

    public OderLine(int amount, Item item) {
        this.amount = amount;   // Slaat het aantal op dat voor dit item besteld is
        this.item = item;       // Bewaart het Item-object zelf (bevat id, prijs, etc.)
    }

    public double getPrice(){
        return amount * item.getPrice();   // Totale prijs = aantal × prijs van het item
    }

    public void incrementAmount(){
        amount++;   // Verhoogt het aantal met 1 (bijv. als hetzelfde item opnieuw wordt toegevoegd)
    }

    public int getAmount() {
        return amount;   // Geeft terug hoeveel stuks er van dit item zijn
    }

    public Item getItem() {
        return item;     // Geeft het Item terug dat in deze orderline zit
    }

    // Gewenste vorm:
    // B1011   "Titel" (auteur1, auteur2)                   2  64,98 EUR
    @Override
    public String toString() {

        /*
         UITLEG WAAROM DEZE VARIABELEN WORDEN GEBRUIKT:

         1) item.getId()
            - Een OrderLine toont altijd eerst het nummer van het item.
            - Dat nummer zit in het Item-object zelf, dus roepen we getId() aan.

         2) item
            - Wanneer een object in een String wordt gebruikt, wordt automatisch zijn toString() aangeroepen.
            - Book.toString() geeft: "Titel" (auteur1, auteur2)
            - Movie.toString() geeft: "Filmtitel" (acteur1, ...)
            - Daarom geven we gewoon 'item' mee → Java roept vanzelf de gepaste toString() op.
              Zo hoeven we de beschrijving niet zelf te reconstrueren.

         3) amount
            - Dit is het aantal exemplaren van dit item.
            - Wordt letterlijk in de output getoond, dus moet in de toString() komen.

         4) getPrice()
            - Dit geeft de totale prijs van deze OrderLine (aantal × prijs per stuk).
            - Dat is precies wat aan het einde van de lijn moet staan.

         FORMATTERING:
         "%-8s %-30s %d  %.2f EUR"
         - %-8s   → item.getId() links uitlijnen in een veld van 8 chars
         - %-30s  → tekstbeschrijving (dus item.toString()) in veld van 30 chars
         - %d     → amount
         - %.2f   → prijs met 2 decimalen
        */

        return String.format(
                "%-8s %-30s %d  %.2f EUR",
                item.getId(),    // Unieke code van het item (bv. B1011)
                item,            // Beschrijving → automatisch item.toString()
                amount,          // Hoeveel exemplaren
                getPrice()       // Totaalprijs van deze orderline
        );
    }
}

