package Java.Array;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int n = removeDuplicates(arr);
        System.out.println(n);
    }

    static int removeDuplicates(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
        // int start = 0;
        // int end = nums.length - 1;
        // int count = 0;
        // while (start < end) {
        // if (nums[start] == nums[start + 1]) {
        // int temp = nums[start];
        // for (int i = start + 1; i < end; i++) {
        // nums[i] = nums[i + 1];
        // }
        // nums[end] = temp;
        // end--;
        // } else {
        // start++;
        // count++;
        // }
        // }
        // return nums;
    }
}
