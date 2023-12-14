package Java;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastInArray {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 7, 7, 7, 7, 7, 7, 8, 9 };
        int target = 7;
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] nums, int target, boolean sch) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (sch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
