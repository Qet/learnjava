public class Car extends Vehicle {
    public Car(String make, String model) {
        super(0,0);
        this.make = make;
        this.model = model;
        this.gear = 0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void changeGears(int newGear){
        if (newGear < 1 || newGear > 4){
            System.out.println("Invalid gear: " + newGear);
            return;
        }
        gear = newGear;
        setSpeed((int)Math.pow(newGear, 3));
    }

    @Override
    public void print(){
        System.out.println(make + " " + model + " in gear " + gear);
        super.print();
    }

    private int gear;

    private String make;
    private String model;
}
