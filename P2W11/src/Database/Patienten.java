import java.util.*;

public class Patienten {
    private static int volgendeId = -1;
    private Map<Integer,Patient> patienten;

    public Patienten()
    {
        patienten = new HashMap<>();
    }

    public Map<Integer, Patient> getPatienten() {
        return patienten;
    }

    public Boolean insert(Patient pat)
    {
        volgendeId++;
        pat.setId(volgendeId);
        patienten.put(volgendeId,pat);
        return true;
    }

    public Boolean delete(int id)
    {
        if(patienten.containsKey(id))
        {
            patienten.remove(id);
            return true;
        }
        else return false;
    }

    public Patient findById(int id)
    {
        if (patienten.containsKey(id))
        {
            return patienten.get(id);
        }
        else return null;
    }

    public Set<Patient> findByHuisarts(int id)
    {
        Set<Patient> newset = new HashSet<Patient>(10);

        for(Patient p : patienten.values())
        {
            if(p.getHuisartsId() == id)
            {
                newset.add(p);
            }
        }
        return newset;
    }



}
