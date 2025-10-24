package films;

public class Film {
    String titel;
    int jaar;


    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }
}
