package Contacten;

public class Contact {
    private String name;
    private ContactData contactData;

    public Contact (String name, ContactData contactData) {
        this.name = name;
        this.contactData = contactData;

    }


    public String getName() {
        return name;
    }

    public ContactData getContactData() {
        return contactData;
    }


    // Optional reusable helper for subclasses
    protected String contactCore() {
        return String.format("%s, %s", name, contactData);
    }


    @Override
    public String toString() {
        return contactCore();
    }
}
