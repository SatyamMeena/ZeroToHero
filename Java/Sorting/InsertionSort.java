package Java.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 10, 3, 2, 1 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int arr[]) {
        int len = arr.length - 1;
        // for (int i = 0; i < len; i++) {
        // int j = i + 1;
        // while (j > 0) {
        // if (arr[j] < arr[j - 1]) {
        // swap(arr, j, j - 1);
        // j--;
        // } else {
        // break;
        // }
        // }

        // }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j > 0; j--) {
                // int j = i + 1;
                // while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    // j--;
                } else {
                    break;
                }
            }

        }
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}