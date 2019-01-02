package Burgers;

import Breads.BrownRye;
import Toppings.Cheese;
import Toppings.Lettuce;
import Toppings.Onion;
import Toppings.Topping;

public class HealthyBurger extends Burger {

    private final int MAX_TOPPINGS = 2;
    private Topping[] extraToppings = new Topping[MAX_TOPPINGS];

    public HealthyBurger() {
        super(12d, "Healthy Burger", new BrownRye());
        extraToppings[0] = new Cheese();
        extraToppings[1] = new Onion();

        addTopping(new Lettuce());
    }

    @Override
    public String name() {
        String ret = super.name();
        ret += ", with ";
        for (int i = 0; i < MAX_TOPPINGS; i++) {
            if (extraToppings[i] != null)
                ret += extraToppings[i].getName() + ", ";
        }
        return ret;
    }
}
