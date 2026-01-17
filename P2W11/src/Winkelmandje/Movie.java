import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{

    private String title;
    private List<String> actors;

    public Movie(String id, double price, String title, String actor) {
        super(id, price);
        actors = new ArrayList<>();
        this.title = title;
        addActor(actor);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void addActor(String actor)
    {
        this.actors.add(actor);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)",this.getTitle(),this.getActors());
    }
}
