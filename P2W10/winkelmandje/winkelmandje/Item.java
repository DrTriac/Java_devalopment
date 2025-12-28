package winkelmandje;

// *****************************************************************************************
// Abstracte klasse vs. Interface
// *****************************************************************************************
// In Java heb je twee manieren om een gemeenschappelijke "basis" te maken voor klassen:
//   (1) abstracte klassen
//   (2) interfaces
//
// === WAT IS EEN ABSTRACTE KLASSE? ===
// Een abstracte klasse is een gewone klasse, maar je mag er geen objecten van maken.
// Ze dient als basis voor andere klassen.
// Een abstracte klasse:
//    - kan attributen (velden) bevatten, zoals 'id' en 'price'
//    - kan een constructor hebben die waardes instelt
//    - kan zowel *volledige methodes* als *abstracte methodes* bevatten
//    - laat toe om code te delen tussen subklassen
//
// === WAT IS EEN INTERFACE? ===
// Een interface definieert alleen WAT een klasse kan doen, maar niet HOE.
// Een interface:
//    - bevat GEEN constructors (dus kan geen velden initialiseren)
//    - bevat doorgaans GEEN velden (behalve public static final constants)
//    - definieert alleen methodes die de klassen moeten implementeren
//    - kan geen concrete toestand (state) bewaren
//
// *****************************************************************************************
// WAAROM GEBRUIKEN WE HIER GEEN INTERFACE?
// *****************************************************************************************
// De klasse Item MOET een constructor hebben om:
//    - id te initialiseren
//    - price te initialiseren
//
// En Item MOET echte velden bevatten:
//    - protected String id;
//    - protected double price;
//
// Een interface kan GEEN constructor hebben → dus kan id en price niet instellen.
// Een interface kan GEEN "gewone variabelen per object" bewaren → dus geen id/price opslaan.
//
// Daarom is een interface hier onmogelijk.
//
// EEN ABSTRACTE KLASSE is dus volledig logisch:
//    ✔ we willen gedeelde attributen (id, price)
//    ✔ we willen een constructor die die attributen zet
//    ✔ we willen een gedeelde basis voor Book en Movie
//    ✔ maar we willen niet dat Item-objecten direct gemaakt worden
//
// Kortom: Item is een typisch voorbeeld van iets dat je ALTIJD als abstracte klasse maakt
// en NOOIT als interface.
// *****************************************************************************************


public abstract class Item {

    // Het unieke nummer (id) van het item
    protected String id;

    // De prijs van het item
    protected double price;

    // Constructor van Item die de gedeelde velden instelt
    public Item(String id, double price) {
        this.id = id;              // Opslaan van het id in het attribuut
        this.price = price;        // Opslaan van de prijs
    }

    // Getter voor het id
    public String getId() {
        return id;                 // Geeft het id terug
    }

    // Getter voor de prijs
    public double getPrice() {
        return price;              // Geeft de prijs terug
    }

    // Elke subclass moet zelf zijn toString() schrijven,
    // daarom is deze klasse abstract.
}
