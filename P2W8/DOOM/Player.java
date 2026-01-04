package DOOM;
import java.util.Random;

public class Player {
    public final static double START_HEALTH = 9;
    private double health;
    private int X, Y;
    private Random random;
    private Room room;

    public Player(int x, int y) {

    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getHealth() {
        return health;
    }

    public void attack(){

    }

    public boolean isDeath()
    {
        return false;
    }

    public void move()
    {

    }

    public String toString()
    {
        return "P";
    }
}
