package Contacten;

public class Partner extends Contact {
    private String companyNumber;

    public Partner(String name, ContactData contactData, String number) {
        super(name, contactData);
        this.companyNumber = number;

    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public String toString()
    {
        return String.format("Klant (%s): %s", this.companyNumber, contactCore());
    }

}

