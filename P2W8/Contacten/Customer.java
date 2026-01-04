package Contacten;

public class Customer extends Contact  {

    private int id;
    public  Customer(String name, ContactData contactData, int id) {
        super(name, contactData);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        //Klant (201879): Bianca Pieters, bianca.pieters@thuis.com, geen vast nummer, 0478/65.25.86 (M)
        return String.format("Klant (%d): %s", this.id, contactCore());
    }


}
