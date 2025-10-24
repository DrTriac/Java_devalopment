package films;

public class FilmVerzameling {
    private final int MAX_AANTAL=9;
    private Film[] films;
    private int index;
    private boolean isVol;

    public FilmVerzameling(){
        films = new Film[MAX_AANTAL];
        index = 0;
        isVol = false;
    }

    public int getIndex ()
    {
        return index;
    }

    public boolean isVol ()
    {
        return isVol;
    }

    public Film [] getFilms ()
    {
        return films;
    }

    public boolean voegFilmToe(Film film)
    {
        if(!isVol && index<MAX_AANTAL)
        {
            films[index] = film;
            index++;
            return true;
        }
        else{
            isVol = true;
            return false;
        }
    }


}
