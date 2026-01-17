public class Patient {
    private int id=-1;
    private String name;
    private int huisartsId=-1;

    public Patient (String name)
    {
        this.name = name;
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

    public int getHuisartsId() {
        return huisartsId;
    }

    public void setHuisartsId(int huisartsId) {
        this.huisartsId = huisartsId;
    }


}
