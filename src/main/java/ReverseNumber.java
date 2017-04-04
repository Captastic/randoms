/**
 * Created by anthonycapriotti on 3/24/17.
 */
public class ReverseNumber {

    static int num = 12345;
    static int reverseNum = 0;

    public static boolean reverse(int num) {

        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }

        if (num == reverseNum){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args){
        System.out.println(reverse(num));
    }
}
