public class Main {
    public static void main(String[] args) {
        Biervat stellaVat = new Biervat();
        stellaVat.setCapaciteitF(100f);
        stellaVat.vulVolledig();
        stellaVat.percentageGevuld();
        System.out.println(stellaVat.IsVol());
        stellaVat.tap(3);
        System.out.println(stellaVat.IsVol());



    }
}
