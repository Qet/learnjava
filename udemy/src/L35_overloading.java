public class L35_overloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2, 4));
        System.out.println(calcFeetAndInchesToCentimeters(34));

    }

    static final double INCHES_IN_A_FOOT = 12d;
    static final double CM_IN_AN_INCH = 2.54d;


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return (feet * INCHES_IN_A_FOOT + inches) * CM_IN_AN_INCH;
        }
        else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            return calcFeetAndInchesToCentimeters(Math.floor(inches / INCHES_IN_A_FOOT),
                    inches % INCHES_IN_A_FOOT);
        }
        else{
            return -1;
        }
    }

}
