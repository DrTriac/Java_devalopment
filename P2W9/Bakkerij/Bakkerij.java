package Bakkerij;

public class Bakkerij {
    private Product[] producten;
    private int aantal;
    public static final int MAX_PROXUCTEN=10;

    public Bakkerij() {
        producten = new Product[MAX_PROXUCTEN];
        aantal = 0;
    }
    public Boolean voegProductToe(Product p) {
        if (aantal < MAX_PROXUCTEN) {
            producten[aantal] = p;
            aantal ++;
            return true;
        }
        else return false;
    }

    public int getAantal() {
        return aantal;
    }
}


