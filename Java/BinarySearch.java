package Java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 45, 56, 58, 67, 78, 99, 677, 6554, 66777 }; // sorted Array
        int target = 67;
        int index = binarySearch(arr, target);
        System.out.print("The index is : " + index);
    }

    static int binarySearch(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // int mid = (start + end) / 2; // This might exceed the range of interger if
            // start and end values are large
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}
