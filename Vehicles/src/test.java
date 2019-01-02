public class test {
    public static void main(String[] args) {
        Volvo v = new Volvo();

        for (int i = 0; i < 100; i++) {
            v.print();
            v.changeGears(i / 10);
            v.stepTime();
        }

    }
}
