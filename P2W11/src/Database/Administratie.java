import java.util.*;

public class Administratie {
    private Map<Integer,Patient> patienten;
    private Map<Integer,Huisarts> huisartsen;

    public Administratie(HashMap<Integer,Patient> patienten, HashMap<Integer,Huisarts> huisartsen)
    {
        this.patienten = new HashMap<Integer,Patient>(patienten);
        this.huisartsen = new HashMap<>(huisartsen);
    }


    public Set<Patient> verwijderPatientenMetVerkeerdeHuisarts() {

        Set<Patient> verkeerd = new HashSet<>();
        for (Patient p : patienten.values()) { 
            if (!huisartsen.containsKey(p.getHuisartsId())) {
                verkeerd.add(p); } } 
        for (Patient p : verkeerd) { 
            patienten.remove(p.getId());
            System.out.println("Patient " + p.getName() + " verwijderd (verkeerde huisartsId: " + p.getHuisartsId() + ")"); } return verkeerd;


    }

    public Boolean showHuisarts()
    {
        for (Patient p : patienten.values())
        {
            int huisartsId = p.getHuisartsId();
            String s = String.format("%s %s",p.getName(), huisartsen.get(huisartsId));
            System.out.println(s);

        }
        return true;
    }

    public void showPatients()
    {

        System.out.println("Alle patiënten:\n");
        System.out.format("%s%5s%-20s%-2s%-13s\n","ID","|"," NAAM","|","HUISARTS");
        System.out.format("---------------------------------------------------\n");

        for (Patient p : patienten.values())
        {
            int huisartsid = p.getHuisartsId();

            System.out.format("%5s%2s%-20s%s%s\n",p.getId(),"|",p.getName(),"|",huisartsen.get(huisartsid).getNaam());
        }
    }


}
