import java.util.ArrayList;
import java.util.List;

public class Book extends Item {

    private String title;
    private List<String> authors;

    public Book(String id, double price, String title, String author)
    {
        super(id, price);
        authors = new ArrayList<String>();
        this.addAuthor(author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author)
    {
        this.authors.add(author);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s",this.title,this.authors);
    }
}
