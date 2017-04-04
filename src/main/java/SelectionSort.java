/**
 * Created by anthonycapriotti on 3/23/17.
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

                 int small = arr[index];
                 arr[index] = arr[i];
                 arr[i] = small;


        }
        return arr;
    }

    public static void main (String[] args){
        int[] arr = {-5, 1, 12, 5, 16, 2, 13, 14};

        selectionSort(arr);
        for (int i: arr){
            System.out.println(i);
        }
    }
}
