package Java.BinarySearch;

import java.util.Arrays;

public class BinarySearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target =4;
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    static int[] find(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length - 1;

        int cMid = (rStart + rEnd) / 2;
        int cEnd = matrix[0].length - 1;

        //Incase there is single array in input
        if (matrix.length == 1){
            return binarySearch(matrix, target, 0, 0, cEnd);
        }

        while (rStart < rEnd - 1) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            }
            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }

        }

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        if (matrix[rStart][cMid -1] >=  target) {
            binarySearch(matrix, target, rStart, 0, cMid - 1);
        }

        if (matrix[rStart][cMid + 1] <= target && matrix[rStart][cEnd] >= target) {
         return   binarySearch(matrix, target, rStart, cMid + 1, cEnd);
        }

        if (matrix[rStart + 1][cMid -1 ]   >= target) {
          return  binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }

        if (matrix[rStart + 1][cMid+ 1] <= target) {
         return   binarySearch(matrix, target, rStart + 1, cMid + 1, cEnd);
        }

        return new int[] { -1, -1 };
    }

}
