package Java;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 45, 56, 58, 67, 78, 99, 677, 6554, 66777 }; // sorted Array asc
        int[] arrDSC = { 99, 88, 67, 56, 45, 34, 32, 23, 12, 1 };
        int target = 67;
        int targetDSC = 67;
        int index = agnosticBinarySearch(arr, target);
        System.out.println("ASC  index is : " + index);
        System.out.print("DSC INDEX  : " + agnosticBinarySearch(arrDSC, targetDSC));
    }

    static int agnosticBinarySearch(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

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
