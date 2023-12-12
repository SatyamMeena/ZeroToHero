package Java;

import java.util.Arrays;

public class LinearSearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { -22, 5, 6 },
                { 454, -2, 4 } };
        int ans = min(arr);
        System.out.println("Min is : " + ans);
        int target = 454;
        System.out.println(Arrays.toString(index(arr, target)));
    }

    static int min(int[][] arr) {

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    static int[] index(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
