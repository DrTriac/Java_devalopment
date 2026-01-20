import java.lang.reflect.Array;
import java.util.*;

public class TabelMendeljev implements Reactant {
    TreeSet<Atoom> atomen;

    public TabelMendeljev() {
        atomen = new TreeSet<>();

    }

    public void voegAtoomToe(Atoom a)
    {
        atomen.add(a);

    }

    public void printMetalen()
    {
        for(Atoom a : atomen)
        {
            if(a instanceof Metaal)
            {
                System.out.println(a);
            }
        }
    }

    public void print()
    {
        for(Atoom a : atomen)
        {
            System.out.println(a);
        }
    }

    public Atoom genereerAtoom()
    {
        Random r = new Random();
        int n = r.nextInt(atomen.size());
        Atoom chozen = atomen.toArray(new Atoom[0])[n];
        return chozen;
    }

    public Boolean isLeeg()
    {
        return false;
    }


}
