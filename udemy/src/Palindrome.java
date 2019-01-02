public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome(int n){
        String s = Integer.toString(Math.abs(n));

        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        return rev.toString().equals(s);
    }
}
