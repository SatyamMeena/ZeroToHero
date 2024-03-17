package Java.Sorting;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end) {
        if (end - start == 1) { 
            return;
        }
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }
        while (j < end) {
            mix[k++] = arr[j++];
        }

        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[start + k2] = mix[k2];
        }
    }
}
