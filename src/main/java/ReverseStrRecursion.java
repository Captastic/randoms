/**
 * Created by anthonycapriotti on 3/23/17.
 */
public class ReverseStrRecursion {

    public static String reverse(String str){
        if (str.length() == 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main (String[] args){
        System.out.println(reverse("Cap"));

    }
}
