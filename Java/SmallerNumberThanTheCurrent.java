package Java;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class SmallerNumberThanTheCurrent {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 3, 2, 9 };
        //output = [4, 3, 0, 2, 0, 5]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        // Brute Force Solution
        // for(int i = 0;i<nums.length;i++){
        // int count = 0;
        // for(int j = 0;j<nums.length;j++){
        // if (nums[i] > nums [j]){
        // count++;
        // }
        // }
        // arr[i] = count;
        // }

        int[] count = new int[101];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[i] = 0;
            } else {
                arr[i] = count[nums[i] - 1];
            }
        }
        return arr;
    }

}
