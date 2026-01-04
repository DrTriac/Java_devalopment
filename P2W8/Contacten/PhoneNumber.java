package Contacten;

public class PhoneNumber {
    private String number;
    Kind kind;
    public PhoneNumber(Kind kind, String number) {
        this.number = number;
        this.kind = kind;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s",number,kind.toString());
    }
}
