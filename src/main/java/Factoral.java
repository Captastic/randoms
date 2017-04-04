/**
 * Created by anthonycapriotti on 3/29/17.
 */
public class Factoral {
    static int n = 5;
    static int temp=1;

    public static int factoral(int n){
        for (int i = n; i >= 1; i--){
            temp *= i ;
        }
        return temp;
    }

    public static int factorialrecursive(int n){
        if(n==1){
            return n;
        }
        return n* factorialrecursive(n-1);
    }


    public static void main(String[] args){
        System.out.println(factorialrecursive(n));
    }
}
