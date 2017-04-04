/**
 * Created by anthonycapriotti on 3/17/17.
 */
public class numberPalindrome {
    public static void main (String[] args){
        isPalindrome(11);
    }

    public static void isPalindrome(int x) {
        //negative numbers are not palindrome
        if (x < 0)
            System.out.println(false);

        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right) {
                System.out.println(false);
            }

            x = (x % div) / 10;
            div /= 100;
        }
        System.out.println(true);
    }
}
