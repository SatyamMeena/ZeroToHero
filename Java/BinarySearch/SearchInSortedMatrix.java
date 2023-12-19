package Java.BinarySearch;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        // int[][] arr = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 18, 27, 37, 47 },
        // { 29, 34, 43, 50 }
        // };

        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target = 11;
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] find(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] > target) {
                col--;
            }
            if (arr[row][col] < target) {
                row++;
            }

        }
        return new int[] { -1, -1 };
    }
}
