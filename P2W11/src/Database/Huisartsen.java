import java.util.HashMap;
import java.util.Map;

public class Huisartsen {
    private Map<Integer,Huisarts> huisartsen;
    private static int volgendeId;

    public Huisartsen()
    {
        huisartsen = new HashMap<>(20);

    }

    public Boolean insert(Huisarts h)
    {
        huisartsen.put(volgendeId++,h);
        return true;
    }

    public Boolean delete(int id)
    {
        if(huisartsen.containsKey(id))
        {
            huisartsen.remove(id);
            return true;
        }
        else return false;

    }

    public Map<Integer, Huisarts> getHuisartsen() {
        return huisartsen;
    }

    public Huisarts findById(int id)
    {
        if(huisartsen.containsKey(id))
        {
            System.out.println(huisartsen.get(id));
            return huisartsen.get(id);

        }
        else return null;

    }



}
