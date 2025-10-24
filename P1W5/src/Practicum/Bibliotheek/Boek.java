package Bibliotheek;

public class Boek {
    String author;
    String title;
    int numberofpages;
    boolean borrowed;

    public Boek(String author, String title, int numberofpages) {
          this.author = author;
          this.title = title;
          this.numberofpages = numberofpages;
          borrowed = false;
    }

    public Boek()
    {
        this.author = "onbekend";
        this.title = "onbekend";
        this.numberofpages = 0;

    }

    private String getAuthor() {
        return author;
    }
    private String getTitle() {
        return title;
    }
    private int getNumberofpages() {
        return numberofpages;
    }
    private boolean getBorrowed() {
        return borrowed;
    }
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }

    public void printDetails(Boek boek)
    {
        //variable = (condition) ? expressionTrue :  expressionFalse;
        String Isuitegeleend = (boek.borrowed) ? "niet" : "";
        System.out.printf("Het boek %s (%d), geschreven door %s is momenteel %s ontleend \n",(boek.getTitle().toUpperCase()),boek.getNumberofpages(),(boek.getAuthor().toUpperCase()),Isuitegeleend);
    }





}
