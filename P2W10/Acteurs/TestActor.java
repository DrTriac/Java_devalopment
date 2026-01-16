package Acteurs;

import java.util.*;

public class TestActor {
    private static final Actor[] testdata = {
                new Actor("Cameron Diaz", 1972),
                new Actor("Anna Faris", 1976),
                new Actor("Angelina Jolie", 1975),
                new Actor("Jennifer Lopez", 1970),
                new Actor("Reese Witherspoon", 1976),
                new Actor("Neve Campbell", 1973),
                new Actor("Catherine Zeta-Jones", 1969),
                new Actor("Kirsten Dunst", 1982),
                new Actor("Kate Winslet", 1975),
                new Actor("Gina Philips", 1975),
                new Actor("Shannon Elisabeth", 1973),
                new Actor("Carmen Electra", 1972),
                new Actor("Drew Barrymore", 1975),
                new Actor("Elisabeth Hurley", 1965),
                new Actor("Tara Reid", 1975),
                new Actor("Katie Holmes", 1978),
                new Actor("Anna Faris", 1976)
        };

        public static void main(String[] args) {
            Actor reese = new Actor("Reese Witherspoon", 1976);
            Actor drew = new Actor("Drew Barrymore", 1975);
            Actor anna = new Actor("Anna Faris", 1976);
            Actor thandie = new Actor("Thandie Newton", 1972);

            List<Actor> actors = new ArrayList<>();
            actors.addAll(Arrays.asList(testdata));
            actors.add(reese);
            actors.add(drew);
            actors.add(anna);
            actors.add(thandie);



            // Toon de inhoud van de collection (zonder iterator)

            for(Actor a : actors){
                System.out.println(a);
            }

            // Verwijder de objecten reese en thandie
            actors.remove(reese);
            actors.remove(thandie);
            // Verwijder alle acteurs geboren in 1975 (met iterator)

            Iterator<Actor> iterator = actors.iterator();
            while(iterator.hasNext()){
                Actor a = iterator.next();
                if(a.getBirthyear() == 1975){
                    iterator.remove();
                }
            }

            // Verwijder alle dubbele acteurs in de lijst (doe dit bijvoorbeeld door een
            // nieuwe lijst te maken zonder dubbels.  Je kan “contains” gebruiken om te
            // kijken of een element al in de lijst zit)

            List<Actor> nodubs = new ArrayList<>();
            Iterator<Actor> I= actors.iterator();
            while(I.hasNext()){
                Actor a = I.next();
                if(!nodubs.contains(a))
                {
                    nodubs.add(a);
                }
            }

            // Sorteer volgens geboortejaar (oudste eerst) en dan volgens voornaam



            System.out.println("\n Uiteindelijke inhoud:\n");
            nodubs.sort(null);
            for(Actor a : nodubs){
                System.out.println(a);
            }
        }
    }

