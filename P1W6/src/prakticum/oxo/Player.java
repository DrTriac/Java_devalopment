package oxo;

public class Player {
    String move;
    String name;
    int movex;
    int movey;
    boolean hasWon = false;

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovex() {
        return movex;
    }

    public void setMovex(int movex) {
        this.movex = movex;
    }

    public int getMovey() {
        return movey;
    }

    public void setMovey(int movey) {
        this.movey = movey;
    }

    public void setMove(String move) {
        this.move = move;
        this.movex = Character.getNumericValue(move.charAt(0));
        this.movey = Character.getNumericValue(move.charAt(1));
    }

    private String getMove() {
        return move;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public String checkWinner(Field speelveld) {
        return "test";
    }
}
