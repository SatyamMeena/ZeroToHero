package Java;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 , 5 };
        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            swap(arr, i, n - i);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int array[], int a, int b) {

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
