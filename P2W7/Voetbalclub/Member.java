package Voetbalclub;

public class Member {
    int id;
    String name;
    int type;

    public Member(int id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
//1001 Luka     soort: gewoon
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + "soort " + this.type;
    }
}
