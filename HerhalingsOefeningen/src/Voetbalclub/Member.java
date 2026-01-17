package Voetbalclub;

public class Member {
    private int id;
    private String name;
    private MemberType type;

    public Member(int id, String name, MemberType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%d %s\t soort: %s",this.id, this.name, this.type);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MemberType getType() {
        return type;
    }
}
