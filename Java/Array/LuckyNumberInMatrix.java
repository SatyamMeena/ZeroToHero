package Java.Array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 }
        };

        List<Integer> list = new ArrayList<>();

        list = luckyNumbers(matrix);
        System.out.println(list);
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;

            int minIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > max) {
                    max = matrix[k][minIndex];
                    maxIndex = k;
                }
            }

            if (matrix[i][minIndex] == matrix[maxIndex][minIndex]) {
                list.add(matrix[i][minIndex]);
            }
        }
        return list;
    }
}
