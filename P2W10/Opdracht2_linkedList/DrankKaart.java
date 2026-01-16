package Opdracht2_linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DrankKaart {
    List<Drank> drankkaart;

    public DrankKaart() {
        drankkaart = new LinkedList<>();
    }

    public void voegDrankToe(Drank drink)
    {
        drankkaart.add(drink);
    }

    public int getAantal()
    {
        return drankkaart.size();
    }

    public String getTotalePrijs() {
        double totalsum = 0;
        Iterator it = drankkaart.iterator();

        while (it.hasNext()) {
            Drank drink = (Drank) it.next();
            totalsum = totalsum + drink.getPrijs();
        }
        return String.format("€%.2f", totalsum);
    }

    @Override
    public String toString(){
        String s = "";
        Iterator it = drankkaart.iterator();
        while (it.hasNext()) {
            Drank drink = (Drank) it.next();
            s += drink.toString() + "\n";
        }
        return s;
    }

    public Drank duurste()
    {
        Drank duurste = drankkaart.getFirst();
        Iterator it = drankkaart.iterator();
        while (it.hasNext()) {
            Drank drink = (Drank) it.next();
            if (drink.getPrijs() >= duurste.getPrijs()) {
                duurste = drink;
            }
        }
        return duurste;
    }

    public void getAlcoholischeDranken()
    {
        Drank duurste = drankkaart.getFirst();
        Iterator it = drankkaart.iterator();
        while (it.hasNext()) {
            Drank drink = (Drank) it.next();
            if (drink.getAlcohlisch()) {
                System.out.println(drink);
            }
        }
    }

}
