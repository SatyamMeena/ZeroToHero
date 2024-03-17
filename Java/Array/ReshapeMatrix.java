package Java.Array;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1;
        int c = 4;

        int[][] reshapedMat = matrixReshape(mat, r, c);
        for (int[] is : reshapedMat) {
            System.out.println(Arrays.toString(is));
        }

    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int totalrow = mat.length * mat[0].length;
        if (totalrow != r * c) {
            return mat;
        }

        int row = 0;
        int col = 0;
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (col >= mat[0].length && row <= mat.length) {
                    col = 0;
                    row++;
                }
                matrix[i][j] = mat[row][col];
                col++;
            }
        }
        return matrix;
    }

}
