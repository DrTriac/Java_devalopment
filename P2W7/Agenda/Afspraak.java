package Agenda;

import java.time.LocalDateTime;

public class Afspraak {
    private AfspraakType afspraakType;
    private LocalDateTime datum;
    private static int aantalAfspraken;

    public Afspraak(AfspraakType afspraakType, LocalDateTime of) {

    }

    public int getAantalAfspraken() {
        return aantalAfspraken;
    }

}
