package Java.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 6 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }

    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
