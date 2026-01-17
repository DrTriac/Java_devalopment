import java.util.*;

public class F1Pilots {
    Map<String, F1Pilot> pilots;


    F1Pilot[] champions = {
            new F1Pilot("Duits", "Michael Schumacher", 7),
            new F1Pilot("Argentijns", "Juan Manuel Fangio", 5),
            new F1Pilot("Frans", "Alain Prost", 4),
            new F1Pilot("Duits", "Sebastian Vettel", 4),
            new F1Pilot("Australisch", "Jack Brabham", 3),
            new F1Pilot("Brits", "Jackie Stewart", 3),
            new F1Pilot("Oostenrijks", "Niki Lauda", 3),
            new F1Pilot("Braziliaans", "Nelson Piquet", 3),
            new F1Pilot("Braziliaans", "Ayrton Senna", 3)
    };

    int[][] seasons = {
            {1994, 1995, 2000, 2001, 2002, 2003, 2004},
            {1951, 1954, 1955, 1956, 1957},
            {1985, 1986, 1989, 1993},
            {2010, 2011, 2012, 2013},
            {1959, 1960, 1966},
            {1969, 1971, 1973},
            {1975, 1977, 1984},
            {1981, 1983, 1987},
            {1988, 1990, 1991}
    };

    public F1Pilots() {
        pilots = new TreeMap<>();
        fillmap();
    }

    public void fillmap() {
        int y = 0;
        for (int i = 0; i < 9; i++) {
            y = 0;
            while (y < seasons[i].length) {
                String s = String.valueOf(seasons[i][y]);
                champions[i].addSeason(seasons[i][y]);
                y++;
            }
            pilots.put(champions[i].getName(), champions[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (F1Pilot p : pilots.values())
        {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}

