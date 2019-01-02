import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<Integer> t = new LinkedList<>();

        t.add(0);
        t.add(1);
        t.add(2);

        t.add(0, 55);

        for(Integer i : t){
            System.out.println(i);
        }
    }
}
