public class Animal {
    private int size;
    private int weight;
    private int height;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Animal(int size, int weight, int height) {
        this.size = size;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
            return super.toString();
    }
}
