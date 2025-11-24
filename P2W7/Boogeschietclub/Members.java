package Boogeschietclub;

public class Members {
    public  int number;
    public  String name;
    public static int  nextId = 10000;

    Members(String naam) {
        name = naam;
        number = nextId++;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    @Override
    public String toString() {
        return this.getName() +"\t" + this.number;
    }
}
