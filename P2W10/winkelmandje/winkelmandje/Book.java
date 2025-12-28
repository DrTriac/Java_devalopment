package winkelmandje;

import java.util.ArrayList;
import java.util.List;

/*
 De klasse Book moet afgeleid zijn van Item. (dus: extends Item)
 Een book heeft:
   - een titel
   - een lijst van auteurs
 De constructor krijgt één auteur binnen
 addAuthor() laat toe om er extra toe te voegen
 toString() moet id + titel + auteurs teruggeven
*/
public class Book extends Item {

    // De titel van het boek
    private String title;

    // Een lijst die alle auteurs bevat (altijd minstens 1 auteur)
    private List<String> authors;

    // Constructor van Book, ontvangt id, prijs, titel en een eerste auteur
    public Book(String id, double price, String title, String author) {

        super(id, price); // roept de constructor van Item aan zodat Item zijn velden (id & price) kan instellen
        this.title = title; // slaat de titel die meegegeven werd op in het titel-attribuut
        authors = new ArrayList<>(); //maakt een lege ArrayList aan om auteurs te bewaren
        authors.add(author); // omdat de opdracht zegt dat er minstens 1 auteur wordt meegegeven, stoppen we deze auteur meteen in de lijst
    }

    // Methode om extra auteurs toe te voegen
    public void addAuthor(String author) {
        authors.add(author); //voegt een extra auteur toe aan de lijst (kan dus meerdere auteurs bevatten)
    }

    // Getter voor de titel van het boek
    public String getTitle() {
        return title; // Geeft de titel terug
    }

    // Getter voor lijst van auteurs
    public List<String> getAuthors() {
        return authors; // Geeft de volledige lijst van auteurs terug
    }

    // Voorbeeld gewenste output:
    // "Titel" (auteur1, auteur2)
    @Override
    public String toString() {

        // String.format maakt een geformatteerde string volgens het opgegeven patroon
        // "%s" → plaats de titel
        // "%s" → plaats de auteurslijst als één string, met komma's tussen elke auteur
        //
        // String.join(",", authors) → maakt van ["auteur1","auteur2"] → "auteur1,auteur2"
        return String.format("\"%s\" (%s)", title, String.join(",", authors));

        // Alternatief idee:
        // authors.toString().replace("[","").replace("]","")
        // Maar String.join() is netter en zo leren we weer een methode bij van String
        // Vraagje -> is deze methode static? Wat wilt dat zeggen?
    }
}
