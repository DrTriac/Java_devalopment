package winkelmandje;

import java.util.LinkedList;   // LinkedList zoals opdracht vraagt
import java.util.List;        // Interface voor de lijst

public class ShoppingBasket {

    // De winkelmand bevat meerdere OrderLines (voor elk uniek item één lijn)
    // Weet je niet wat een orderline is? Ga eens naar bol.com. Daar kan je je winkelmandje vullen met
    // orderlines. Elke orderline bevat één Item en een aantal. Een winkelmandje bevat dan meerdere orderlines.
    // We gebruiken een LinkedList zoals gevraagd.
    private List<OderLine> lines;

    public ShoppingBasket() {
        lines = new LinkedList();
    }

    /*
      addItem():
      - Wordt gebruikt wanneer de gebruiker 1 exemplaar van een Item aan het mandje toevoegt.
      - Als het item al bestaat → aantal verhogen.
      - Als het nog niet bestaat → nieuwe OrderLine maken met amount = 1.
    */
    public void addItem(Item item) {

        // Eerst controleren of dit item al in de lijst staat
        for (OderLine line : lines) {

            // Twee items zijn gelijk als ze hetzelfde id hebben (zoals in opdracht)
            if (line.getItem().getId().equals(item.getId())) {

                // Het item zat al in de mand → aantal +1
                line.incrementAmount();
                return; // Als we het item zijn tegengekomen, kunnen we uit deze methode stappen door een lege return te gebruiken. Zo verhinderen we om het item nogmaals toe te voegen (zie code lijn hieronder).
            }
        }

        // Als we hier komen betekent het dat het item NIET in de lijst stond.
        // Dus maken we een nieuwe orderline met amount = 1.
        lines.add(new OderLine(1, item));
    }

    /*
      removeItem():
      - Verwijdert alle exemplaren van een bepaald item uit de mand.
      - removeIf() verwijdert elke OrderLine waarvan het item-id overeenkomt.
    */
    public void removeItem(Item item) {

        // We gebruiken een Iterator omdat je tijdens het itereren veilig elementen mag verwijderen.
        // Een gewone for-each loop zou een ConcurrentModificationException geven.
        var it = lines.iterator();   // Iterator op de lijst van OrderLines

        // Doorloopt alle orderlines één per één
        while (it.hasNext()) {

            OderLine line = it.next();   // Haalt de volgende orderline op

            // We verwijderen een item als het id overeenkomt met het id van het item dat moet verdwijnen
            if (line.getItem().getId().equals(item.getId())) {

                it.remove();   // Iterator.remove() verwijdert VEILIG het huidige element uit de lijst
            }
        }
    }


    /*
      getPrice():
      - Telt de prijs van ALLE orderlines op.
      - OrderLine.getPrice() geeft: aantal × itemprijs.
      - Dit is de TOTAALPRIJS van het hele winkelmandje.
    */
    public double getPrice() {
        double total = 0;    // Start op 0
        for (OderLine line : lines) {
            total += line.getPrice();  // Tel per orderline de prijs erbij
        }
        return total;         // Totale som teruggeven
    }

    /*
      toString():
      - Bouwt een nette tekstweergave van het mandje met meerdere lijnen.
      - De opdracht vraagt expliciet om StringBuilder te gebruiken.
      - Waarom die variabelen?

        1) We printen bovenaan een header → deze toont wat elke kolom betekent
        2) Daarna printen we elke OrderLine → die heeft al zijn eigen toString()
           die zelf id, beschrijving, aantal en totaalprijs correct weergeeft.
        3) StringBuilder wordt gebruikt omdat hij efficiënt meerdere lijnen kan samenvoegen.
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Header zoals in voorbeeld
        sb.append("nummer  beschrijving                            aantal  totaal\n");

        // Alle orderlines toevoegen
        for (OderLine line : lines) {
            sb.append(line).append("\n");   // line.toString() wordt automatisch aangeroepen
        }

        return sb.toString();   // Volledige weergave van het mandje teruggeven
    }
}