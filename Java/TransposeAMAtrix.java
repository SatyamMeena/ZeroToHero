package Java;

import java.util.Arrays;

public class TransposeAMAtrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] result = transpose(arr);
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] arr = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[j][i] = matrix[i][j];

            }
        }
        return arr;
    }
}
