import java.util.*;

public class ShoppingBasket {
    private Set<OrderLine> orderlines;


    public ShoppingBasket() {
        this.orderlines = new HashSet<>();
    }

    public void addItem(Item item)
    {
        OrderLine orderLine = new OrderLine(item,1);
        orderlines.add(orderLine);
    }

    public void removeItem(Item item)
    {
        OrderLine orderLine = new OrderLine(item, 1);
        orderlines.remove(orderLine);
    }

    public double getPrice()
    {
        double price=0.0;
        for (OrderLine o : orderlines)
        {
            price = price + o.getPrice();
        }

        return price;
    }

    public List<OrderLine> itemsSortedById()
    {
        List<OrderLine> list = new ArrayList<>(orderlines);
        list.sort(Comparator.comparing(o -> o.getItem().getId()));
        return list;
    }

    public List<OrderLine> itemsSortedByName()
    {
        List<OrderLine> list = new ArrayList<>(orderlines);
        list.sort(Comparator.comparing(o -> {
            Item item = o.getItem();
            if (item instanceof Book)
            {
                return ((Book) item).getTitle();
            } else if (item instanceof Movie) {
                return ((Movie) item).getTitle();
            }
            else {return " ";}
        }));
        return list;
    }

    public List<OrderLine> itemsSortedByPrice()
    {
        List<OrderLine> list = new ArrayList<>(orderlines);
        list.sort(Comparator.comparing(o -> o.getItem().getPrice()));
        return list;
    }

    @Override
    public String toString() {
        return String.format(" ");
    }
}
