package LinkedList;

public class testDrankKaart {
    public static void main(String[] args) {
        DrankKaart drankKaart = new DrankKaart();
        Drank cola = new Drank("cola",2.7,false);
        drankKaart.voegDrankToe(cola);
        Drank shweppes = new Drank("shweppes",2.7,false);
        drankKaart.voegDrankToe(shweppes);
        Drank bier = new Drank("bier",2.7,true);
        drankKaart.voegDrankToe(bier);
        Drank wijn = new Drank("wijn",2.7,true);
        drankKaart.voegDrankToe(wijn);
        Drank ricard = new Drank("ricard",3,true);
        drankKaart.voegDrankToe(ricard);
        Drank koffie = new Drank("koffie",2.7,false);
        drankKaart.voegDrankToe(koffie);

        System.out.format("%s\n",drankKaart.getTotalePrijs());
        System.out.println(drankKaart);
    }
}
