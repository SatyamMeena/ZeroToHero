package Java.Bit_Manupulation;

import java.util.Arrays;

//Quesiton : https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        for (int[] row : arr) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i]  = temp; 

            }
        }

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}
