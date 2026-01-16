import java.util.*;

public class Dubbels {
    private List<String> data;

    public Dubbels(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder finalstring = new StringBuilder();
        int counter = 0;
        for  (String s : data) {
            finalstring.append(String.format("%-12s ",s));
            counter++;
            if (counter % 4  == 0) {
                finalstring.append("\n");
            }
        }
        return finalstring.toString();
    }

    public void verwijderDubbels()
    {
        Set<String> hash = new HashSet<String>();
        hash.addAll(data);
        data = new ArrayList<>(hash);
        System.out.println(data);

    }
}





