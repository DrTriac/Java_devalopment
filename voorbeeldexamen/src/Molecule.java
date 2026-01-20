import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Molecule implements Reactant {
    private HashMap<Atoom, Integer> atomen;

    public Molecule() {
        atomen = new HashMap<>();
    }

    public void voegAtoomToe(Atoom atoom, int aantal)
    {
        atomen.put(atoom,aantal);
    }

    public void voegAtoomToe(Atoom atoom)
    {
        atomen.put(atoom,1);
    }

    public double getMassa()
    {
        double totalemassa = 0;
        for(Map.Entry<Atoom,Integer> entry : atomen.entrySet()){
            totalemassa +=entry.getKey().getMassa() * entry.getValue();
        }
        return totalemassa;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Molecule molecule)) return false;
        return Objects.equals(atomen, molecule.atomen);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(atomen);
    }



    @Override
    public String toString() {
        String s = "";
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Atoom,Integer> entry : atomen.entrySet()) {
            Atoom a = entry.getKey();
            int aantal = entry.getValue();
            sb.append(a.getSymbool());

            if(aantal > 1)
            {
                sb.append(aantal);
            }


        }
        return sb.toString();
    }

    @Override
    public Atoom genereerAtoom() {
        return null;
    }

    public  Boolean isLeeg()
    {
        return false;
    }


}
