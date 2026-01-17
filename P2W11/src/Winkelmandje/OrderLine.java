import java.util.Objects;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public void incrementAmount()
    {

    }

    public double getPrice()
    {

        double price = 0.0;
        price = this.getAmount()*this.getItem().getPrice();
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return Objects.equals(item, orderLine.item);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(item);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s \t%12s",this.getItem().getId(), this.getItem().toString(),this.getAmount(),this.getItem().getPrice());
    }
}
