package Java.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 10, 3, 2, 1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int max = -1;
            int index = -1;
            for (int j = 0; j < len - i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }

            int temp = arr[len - i - 1];
            arr[len - i - 1] = arr[index];
            arr[index] = temp;
        }

    }
}
