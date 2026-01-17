package Week_7.Boogschietclub;

public class Member {
    private int number;
    private String name;
    private static int nextid = 1000;

    public Member(String name) {
        this.number = nextid++;
        this.name = name;
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

    @Override
    public String toString() {
        return  number + " "+name;
    }
}
