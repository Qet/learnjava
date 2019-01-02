import java.util.Scanner;

public class scannertest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        System.out.println("You entered: " + line);
    }
}
