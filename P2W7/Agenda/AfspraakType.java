package Agenda;

public enum AfspraakType {
    TELEFOONGESPREK, VERGADERING, AFSPRAAK, LUNCH, BORREL;

    @Override
    public String toString()
    {
        String s = name().toLowerCase();
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
