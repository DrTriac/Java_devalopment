package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class DrankKaart {
    List<Drank> drankkaart = new LinkedList<>();

    public DrankKaart() {

    }

    public void voegDrankToe(Drank d)
    {
        drankkaart.add(d);
    }

    public double getTotalePrijs()
    {
        double totaleprijs = 0;
        for(Drank d : drankkaart)
        {
            totaleprijs = totaleprijs + d.getPrijs();
        }
        return totaleprijs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Drank d : drankkaart)
        {
            sb.append(String.format("%s: €%s\n",d.getNaam(),d.getPrijs()));
        }
        return sb.toString();
    }
}
