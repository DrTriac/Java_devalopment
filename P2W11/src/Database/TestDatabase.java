import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestDatabase {
    public static void main(String[] args) {
        Patienten patienten = new Patienten();
        Huisartsen huisartsen = new Huisartsen();

        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        Patient patient  = new Patient("Flor Wan");
        patient.setHuisartsId(0);
        patienten.insert(patient);
        patient  = new Patient("Bart Matondo");
        patient.setHuisartsId(3);
        patienten.insert(patient);
        patient  = new Patient("Elias Magnus");
        patient.setHuisartsId(2);
        patienten.insert(patient);
        patient  = new Patient("Kevin Koch");
        patient.setHuisartsId(1);
        patienten.insert(patient);
        patient  = new Patient("Lien Krasnovitski");
        patient.setHuisartsId(0);
        patienten.insert(patient);
        patient  = new Patient("Kay Adib");
        patient.setHuisartsId(6);
        patienten.insert(patient);

        Administratie admin = new Administratie((HashMap<Integer, Patient>) patienten.getPatienten(), (HashMap<Integer, Huisarts>) huisartsen.getHuisartsen());
        admin.verwijderPatientenMetVerkeerdeHuisarts();
        //admin.showHuisarts();
        admin.showPatients();


        // schrijf code om alle patienten te verwijderen waarvan de foreign key verkeerd staat.  Rapporteer de gevonden patienten.
        // schrijf code die alle patienten laat zien met de naam van hun huisdokter
        // zorg voor een header en teken de tabel zoals te zien is in het voorbeeld hieronder.
        // De patienten moeten getoond worden in de volgorde van de id’s.

        // schrijf code die een collection maakt van alle patienten die bij huisarts Paulien Vermeiren zitten
        // je schrijft dus eigenlijk code die deze query implementeert:
        // SELECT patienten.id, patienten.naam, huisartsen.naam
        // FROM patienten, huisartsen
        // WHERE huisartsId == huisartsen.id AND huisartsId = 0;
    }

}
