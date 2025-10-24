package films;

public class TestVerzameling {
    public static void main(String[] args) {
        FilmVerzameling verzameling = new FilmVerzameling();

        verzameling.voegFilmToe(new Film("Batman", 1989));
        verzameling.voegFilmToe(new Film("When Harry Met Sally", 1989));
        verzameling.voegFilmToe(new Film("Dances With Wolves", 1990));
        verzameling.voegFilmToe(new Film("Pretty Woman", 1990));
        verzameling.voegFilmToe(new Film("Total Recal", 1990));
        verzameling.voegFilmToe(new Film("Thelma & Louise", 1991));
        verzameling.voegFilmToe(new Film("The Silence Of The Lambs", 1991));
        verzameling.voegFilmToe(new Film("Reservoir Dogs", 1992));
        verzameling.voegFilmToe(new Film("Jurassic Park", 1993));
        verzameling.voegFilmToe(new Film("Schindler's List", 1993));

        Film[] films = verzameling.getFilms();
        for (int i = 0; i < verzameling.getIndex(); i++)  {
            // vul hier aan (volgnr + titel + jaar per film)
            System.out.printf("%d %-30s %d %n",(i+1), films[i].getTitel(), films[i].getJaar() );

        }
        // vul hier aan (afdruk tabel is vol of niet vol)
    }
}