package Java;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, start, end);
        }
        if (nums[pivot] == target)
            return pivot;
        int first = binarySearch(nums, target, start, pivot - 1);
        if (first != -1)
            return first;
        else
            return binarySearch(nums, target, pivot + 1, end);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
