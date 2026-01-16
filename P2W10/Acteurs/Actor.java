package Acteurs;

import java.util.Objects;

public class Actor implements Comparable<Actor>{


    /* Maak een klasse Actor met volgende attributen: name (String) en birthYear (int).
    Voorzie een constructor die de attributen initialiseert en getters voor alle attributen.
    Genereer nu een equals() en hashCode().
    Implementeer toString() zodat deze het geboortejaar en de naam laat zien.
    Laat de klasse Actor de interface Comparable implementeren en zorg dat acteurs worden vergeleken op geboortejaar en daarna op naam.

    Maak nu de klasse TestActor als volgt en vul de code aan zodat je de gewenste output krijgt (zie werking): */

    private String name;
    private int birthyear;

    public Actor(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }
    public int getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", this.birthyear, this.name);
    }

    @Override
    public int compareTo(Actor other) {
        int result = Integer.compare(this.birthyear, other.birthyear);
        if(result == 0)
        {
            result = this.name.compareTo(other.name);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return birthyear == actor.birthyear && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthyear);
    }
}
