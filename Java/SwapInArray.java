package Java;

import java.util.Arrays;

/**
 * SwapInArray
 */
public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int array[], int a, int b) {

        int temp = array[a];
        array [a]= array[b];
        array[b] = temp;
    }

}