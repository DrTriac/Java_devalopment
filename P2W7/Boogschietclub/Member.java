package Boogschietclub;
public class Member
{
    private int number;
    private String name;
    private static int nextId = 1000;

    public Member(String name)
    {
        this.name = name;
        this.number = nextId++;

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Member.nextId = nextId;
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
    public String toString()
    {
        return String.format("Member number= %d, name= %s", number, name);
    }
}