package Bakkerij;

import java.time.LocalDate;

public interface Consumeerbaar {
    // abstract, is not defined in this class and can't have a body here.
    // in this case, isConsumeerbaar is applicable to all objects, therefore ir's a good idea to work it out here
    // by default all methods declared in an interface are public and default. this must not be specified

    //method 1, abstract
    LocalDate getVervalDatum();

    //method 2, not abstract
    default boolean isVervallen()
    {
        LocalDate vervaldatum = getVervalDatum();
        if(vervaldatum == null)
        {
            return true;
        }
        return vervaldatum.isAfter(LocalDate.now());
    }
    //method 3
    public abstract String serveerBeschrijving();



}
