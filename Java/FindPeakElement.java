package Java;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 3, 2, 1 }; // output should be 5
        System.out.println(peek(arr));
    }

    static int peek(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
