package Java.Array;

import java.util.Arrays;

public class RotateArrayToMatch {
    public static void main(String[] args) {
        // int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        // int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        int[][] mat = {
                { 0, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 0, 1 },
                { 0, 0, 1, 0 }
        };
        int[][] target = {
                { 0, 1, 0, 0 },
                { 1, 0, 1, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 0 }
        };

        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        if (mat.length == 1) {
            return true;
        }
        int count = 4;
        while (count > 0) {
            boolean state = verify(mat, target);
            if (state) {
                return true;
            } else {
                rotate(mat);

                for (int[] is : mat) {
                   System.out.println( Arrays.toString(is));
                }
            }
            System.out.println("--------------");
            count--;
        }
        return false;
    }

    static boolean verify(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == target[i][j]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    static void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                if (i != j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }

            }
        }

        for (int i = 0; i < mat.length; i++) {
            int start = 0 ;
            int end = mat.length -1 ;
             while (start < end ){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start ++ ;
                end -- ; 
             }
         
        }
    }
}
