package Bibliotheek;

public class Main {
    public static void main(String[] args) {
        Boek book1 = new Boek("Y. Daniel Liang", "Introduction to Java programming", 1240);
        book1.setBorrowed(true);
        book1.printDetails(book1);

        Boek book2 = new Boek();
        book2.setNumberofpages(291);
        book2.setAuthor("Louis Paul Boon");
        book2.setTitle("De kapellekensbaan");
        book2.printDetails(book2);

        Boek book3 = new Boek("Jef Geeraerts", "Drugs", 333);
        book3.setBorrowed(true);
        book3.printDetails(book3);
    }
}
