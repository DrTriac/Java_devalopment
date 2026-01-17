import java.util.HashSet;
import java.util.Set;

public class F1Pilot {
    private String nationality;
    private String name;
    private int numberOfTitles;
    private Set<Integer> seasons;

    public F1Pilot(String nationality, String name, int numberOfTitles)
    {
        seasons = new HashSet<>(20);
        this.nationality = nationality;
        this.name = name;
        this. numberOfTitles = numberOfTitles;
    }

    public int getNumberOfTitles() {
        return numberOfTitles;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return String.format("%s\t%s\t%d\t%s\n", nationality, name, numberOfTitles, seasons);     }

    public boolean addSeason (int year)
    {
        if(this.seasons.contains(year))
        {
            return false;
        }
        else {this.seasons.add(year); return true;}
    }
}
