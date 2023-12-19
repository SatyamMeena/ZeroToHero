package Java;

import java.util.Arrays;

public class SuffleInArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int n = 3;
        //Output = {1,4,2,5,3,6};
        System.out.println(Arrays.toString(suffle(nums, n)));
    }

    static int[] suffle(int [] nums , int n){
        int [] arr = new int [nums.length];

        int i = 0;
        while (i<n) {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
            i++;
        }
        return arr;
    }
}
