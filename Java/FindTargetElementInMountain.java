package Java;

//https://leetcode.com/problems/find-in-mountain-array/description/

public class FindTargetElementInMountain {
    public static void main(String[] args) {
        // array = [1,2,3,4,5,3,1], target = 3 output = 2
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int target = 3;
        int peek = peek(arr);
        int firstTry = agnosticBinarySearch(arr, target, 0, peek);
        if (firstTry != -1)
            System.out.println(firstTry);
        else
            System.out.println(agnosticBinarySearch(arr, target, peek, arr.length - 1));
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

    static int agnosticBinarySearch(int[] arr, int target, int start, int end) {
        int index = -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2; // This might exceed the range of interger if
            // start and end values are large
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return index;
    }
}