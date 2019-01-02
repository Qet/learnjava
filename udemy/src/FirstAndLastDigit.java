public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(234));
    }

    public static int sumFirstAndLastDigit(int v){
        if (v < 0)
            return -1;

        boolean foundFirst = false;
        int firstDigit = 0;
        int lastDigit = 0;
        for(int p = 3; p >= 0; p--){
            int div = (int)Math.pow(10, p);
            if (p > 0 && v / div > 0){
                if (!foundFirst){
                    firstDigit = v/div;
                    foundFirst = true;
                }
            }

            if (p == 0){
                lastDigit = v;
            }

            if (p > 0){
                v -= (v / div * div);
            }
        }
        if (!foundFirst){
            firstDigit = lastDigit;
        }
        return firstDigit + lastDigit;
    }


}
