/**
 * Created by anthonycapriotti on 3/23/17.
 */
public class BubbleSort {

    //reverse [j-1] and [j] for descending

    public int[] sort(int [] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n - i); j++){
                if (array[j - 1] > array[j]){
                    swapValues(j,array);
                }
            }
        }
        return array;
    }

    private static void swapValues(int j, int[] array){
        int temp;
        temp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = temp;
    }

    public void print(int[] arr){
        for (int k = 0; k < arr.length; k++){
            System.out.println(arr[k] + " ");
        }
    }

    public static void main (String[] args){
        BubbleSort bs = new BubbleSort();
        int [] array = {3, 5, 6, 8, 1};
        bs.sort(array);
        bs.print(array);
    }

}
