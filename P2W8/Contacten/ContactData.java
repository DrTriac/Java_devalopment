package Contacten;

public class ContactData {
    final private int MAX_PHONE_NUMBERS=5;
    private String email;
    private PhoneNumber[] phonenumbers;
    private int numberOfPhoneNumbers;

    public ContactData(String email) {
        this.email = email;
        phonenumbers = new PhoneNumber[MAX_PHONE_NUMBERS];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean addPhoneNumber (PhoneNumber number) {
        if (numberOfPhoneNumbers < MAX_PHONE_NUMBERS) {
            phonenumbers[numberOfPhoneNumbers++] =  number;
            return true;
        }
        else return false;
    }

    public PhoneNumber[] getPhonenumbers() {
        return phonenumbers;
    }



        @Override
        public String toString() {

        // Matches the expected examples structure after the header
        return String.format("%s, %s, %s", email, phonenumbers[0], phonenumbers[1]);
    }

}

