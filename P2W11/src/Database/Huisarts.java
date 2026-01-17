public class Huisarts {

    private static int id = -1;
    private String naam;

    public Huisarts(String naam) {
        this.naam = naam;
        this.id = id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Huisarts.id = id;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Huisarts" + "naam='" + naam + '\'';
    }
}
