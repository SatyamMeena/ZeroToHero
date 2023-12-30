package Java.Sorting;

import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 10, 3, 2, 1 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}