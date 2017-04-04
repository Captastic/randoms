/**
 * Created by anthonycapriotti on 3/23/17.
 */
public class FactoralRecursion {

    public static int recursion(int n){

        if (n == 1){
            return n;
        }

        return n * recursion(n -1);
    }

    public static void main(String[] args){
        System.out.println(recursion(5));
    }
}
