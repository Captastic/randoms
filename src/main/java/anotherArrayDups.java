
import java.util.ArrayList;

/**
 * Created by anthonycapriotti on 3/20/17.
 */
public class anotherArrayDups {
    public static void main(String[] args) {
        int[] input = {2,3,6,6,8,9,10,10,10,12,12};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < input.length; i++)
        {
            if(!list.contains(input[i]))
            {
                System.out.println(input[i]);
                list.add(input[i]);
            }
        }
    }
}

