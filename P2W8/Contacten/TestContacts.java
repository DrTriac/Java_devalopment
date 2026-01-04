package Contacten;

public class TestContacts {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        ContactData contactData = new ContactData("bianca.pieters@thuis.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0478/65.25.86"));
        Customer bianca = new Customer("Bianca Pieters", contactData, 201879);
        contacts.addContact(bianca);
        contactData = new ContactData("genesis.kilic@home.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/287.89.75"));
        Customer genesis = new Customer("Genesis Kiliç", contactData, 987968);
        contacts.addContact(genesis);
        contactData = new ContactData("robin.dworak@dum.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/579.87.99"));
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0436/85.77.35.11"));
        Customer robin = new Customer("Robin Dwořak", contactData, 166789);
        contacts.addContact(robin);

        contactData = new ContactData("Lucca Verstraete");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "09/157.99.14"));
        Partner lucca = new Partner("Lucca Verstraete", contactData, "BE15799318");
        contacts.addContact(lucca);
        contactData = new ContactData("raf.ghazi@firma.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "015/87.77.33"));
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0433/33.55.78"));
        Partner raf = new Partner("Raf Ghazi", contactData, "BE87986469");
        contacts.addContact(raf);

        contacts.removeContact(1);


        /*System.out.println(bianca);
        System.out.println(genesis);
        System.out.println(robin);
        System.out.println(lucca);
        System.out.println(raf);*/

        contacts.printAll();


    }
}