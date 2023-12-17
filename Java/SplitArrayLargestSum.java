package Java;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        // nums = [7,2,5,10,8], k = 2 output =2
        int [] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }
    public static int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;
            for (int nums : arr) {
                if (sum + nums > mid) {
                    pieces++;
                    sum = nums;
                } else {
                    sum += nums;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
