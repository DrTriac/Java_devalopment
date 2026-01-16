package Opdracht2_linkedList;

public class Testkaart {

    public static void main(String[] args) {
        Drank icetea = new Drank("icetea", 2.6);
        Drank pintje = new Drank("pintje", 2.7);
        Drank cola = new  Drank("cola", 2.8);
        Drank koffie = new Drank("Koffie",2.5);
        Drank wijn = new Drank("Wijn",3d, true);
        Drank geusje = new Drank("Geusje", 8d, true);
        Drank fles = new Drank("Fles Wijn", 30d, true);

        DrankKaart kaart = new DrankKaart();

        kaart.voegDrankToe(icetea);
        kaart.voegDrankToe(pintje);
        kaart.voegDrankToe(cola);
        kaart.voegDrankToe(koffie);
        kaart.voegDrankToe(fles);
        kaart.voegDrankToe(geusje);
        kaart.voegDrankToe(wijn);

        System.out.println(kaart.getTotalePrijs());
        System.out.println(kaart);
        System.out.println(kaart.duurste());
        kaart.getAlcoholischeDranken();


    }
}
