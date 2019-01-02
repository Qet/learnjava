public class Vehicle {

    public Vehicle(int position, int speed) {
        this.position = position;
        this.speed = speed;
    }

    public Vehicle(){
        this.position = 0;
        this.speed = 0;
    }

    public void stepTime(){
        position += speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void print(){
        System.out.println("Vehicle at pos " + position + ", speed " + speed);
    }
    private int position;
    private int speed;

}
