package winkelmandje;

import java.util.ArrayList;   // Nodig om een lijst van acteurs te maken
import java.util.List;        // Interface voor lijsten

public class Movie extends Item {
    private String title;           // Titel van de film
    private List<String> actors;    // Lijst met alle acteurs

    public Movie(String id, double price, String title, String actor) {
        super(id, price);           // Aanroepen van de superconstructor (stelt id en price in)
        this.title = title;         // Titel opslaan
        this.actors = new ArrayList<>();  // Lege lijst van acteurs maken
        this.actors.add(actor);     // Eerste acteur toevoegen (constructor vereist er één)
    }

    public void addActor(String actor){
        this.actors.add(actor);     // Extra acteur toevoegen aan de lijst
    }

    public String getTitle() {
        return title;               // Titel teruggeven
    }

    public List<String> getActors() {
        return actors;              // Lijst met acteurs teruggeven
    }

    @Override
    public String toString() {
        return String.format("\"%s\" (%s)", title, String.join(", ", actors));
        // toString geeft: "Titel" (acteur1, acteur2, ...)
        // String.join() zet de lijst om naar één string met komma's ertussen
    }
}
