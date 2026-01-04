package Contacten;

public class Contacts {
    private Contact[] contacts;
    private int amount;
    private final int CAPACITY = 100;


    public Contacts() {
        this.contacts = new Contact[CAPACITY];
        amount = 0;
    }


    public boolean addContact(Contact contact) {
        if (amount >= CAPACITY) return false;
        contacts[amount++] = contact;
        return true;
    }


    public int getAmount() {
        return amount;
    }
    public Contact getContact(int index) {
        return contacts[index];
    }


    public boolean removeContact(int index) {
        if (index < 0 || index >= amount) {
            return false;
        }
        for (int i = index; i < amount - 1; i++) {
            contacts[i] = contacts[i + 1];
        }
        contacts[--amount] = null;
        return true;
    }

    public void printAll() {
        for (int i = amount; i > 0; i--) {
            if (contacts[i] != null) {
                System.out.print(getContact(i) + "\n");
            }

        }
    }
}
