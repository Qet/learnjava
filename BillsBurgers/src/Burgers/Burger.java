package Burgers;

import Breads.Bread;
import Item.PriceableItem;
import Toppings.Topping;

public class Burger extends PriceableItem {

    private Topping[] toppings;
    private final int MAX_TOPPINGS = 4;
    private int numToppings = 0;
    private Bread bread;

    public double getTotalPrice() {
        double ret = getPrice();
        for (int i = 0; i < MAX_TOPPINGS; i++) {
            if (toppings[i] != null){
                ret += toppings[i].getPrice();
            }
        }
        return ret;
    }

    public Burger(double price, String name, Bread bread) {
        super(price, name);
        this.toppings = new Topping[MAX_TOPPINGS];
        this.bread = bread;
    }

    public boolean addTopping(Topping topping){
        if (numToppings < MAX_TOPPINGS) {
            toppings[numToppings++] = topping;
            return true;
        }

        System.out.println("ERROR: can't add topping. Too many toppings!");
        return false;
    }

    public String name(){
        String ret = "A " + getName() + ", with ";
        for (int i = 0; i < MAX_TOPPINGS; i++) {
            if (toppings[i] != null)
                ret += toppings[i].getName() + ", ";
        }
        ret += " on " + bread.name();
        return ret;
    }
}
