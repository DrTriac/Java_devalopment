import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SplittableRandom;

public class ArrList {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Bert");
        namen.add("Paul");
        namen.add("Pieter");
        namen.add("Jan");
        namen.add("Marie");

        System.out.format("%s %s",namen.getFirst(),namen.getLast());

        for(String s : namen)
        {
            System.out.println(s);
        }
        System.out.println(namen.contains("Joske"));

        Iterator<String> it = namen.iterator();
        while (it.hasNext())
        {
            String a = it.next();
            if((a.charAt(0) == 'P'))
            {
                it.remove();
            }
        }
        for (String s : namen)
        {
            System.out.println(s);
        }

    }


}