import Burgers.DeluxeBurger;
import Burgers.HealthyBurger;

public class Main {

    public static void main(String[] args) {
        DeluxeBurger db = new DeluxeBurger();
        System.out.println(db.getName() + " costs: " + db.getTotalPrice());
        System.out.println(db.name());
    
        HealthyBurger hb = new HealthyBurger();
        System.out.println(hb.getName() + " costs: " + hb.getTotalPrice());
        System.out.println(hb.name());
    }


}
