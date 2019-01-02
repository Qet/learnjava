
class Qwe{
    public int x;
}

public class testref {

    public static int func(int x){
        return x*2;
    }

    public static void main(String[] args) {
        int res;
        if ((res = func(3)) > 4){
            System.out.println("Res was: " + res);
        }
    }
}
