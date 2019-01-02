package Burgers;

import Breads.White;
import Toppings.Cheese;
import Toppings.Lettuce;
import Toppings.Onion;
import Toppings.Tomato;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super(10d, "Deluxe Burger", new White());
        addTopping(new Cheese());
        addTopping(new Onion());
        addTopping(new Tomato());
        addTopping(new Lettuce());
    }



}
