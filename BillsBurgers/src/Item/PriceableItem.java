package Item;

public class PriceableItem {

    private double price;
    private String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public PriceableItem(double price, String name) {
        this.price = price;
        this.name = name;
    }
}
