import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by anthonycapriotti on 3/24/17.
 */
public class ReverseString {

    String input = "Cap";
    static String reverse;

    public boolean regular(String input){

        for (int i = input.length(); i <= 0; i--){
            reverse += input.charAt(i);
        }

        if (reverse.equals(input))
            return true;
        else
            return false;
    }

    public boolean stack(String input) {
        Stack stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()){
            reverse = reverse + stack.pop();
        }

        if (input.equals(reverse))
            return true;
        else
            return false;

    }


    public boolean queue(String input){
        Queue queue = new LinkedList();

        for (int i = input.length() - 1; i >= 0; i++){
            queue.add(input.charAt(i));
        }

        while (!queue.isEmpty()){
            reverse = reverse + queue.remove();
        }

        if (input.equals(reverse))
            return true;
        else
            return false;
    }
}
