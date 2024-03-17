package Java.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 2, 9, 11 };
        // merge(arr);
        System.out.println(Arrays.toString(merge(arr)));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftArr = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return compareMerge(leftArr, rightArr);
    }

    static int[] compareMerge(int first[], int second[]) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n = first.length;
        int m = second.length;

        int[] finalArr = new int[n + m];

        while (i < n && j < m) {
            if (first[i] < second[j]) {
                finalArr[k++] = first[i++];
            } else {
                finalArr[k++] = second[j++];
            }
        }

        while (i < n) {
            finalArr[k++] = first[i++];
        }

        while (j < m) {
            finalArr[k++] = second[j++];
        }

        return finalArr;
    }
}
