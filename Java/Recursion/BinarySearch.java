package Java.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 111 ,32434 , 342342};
        int target = 111;
        System.out.println(bs(arr, target, 0, arr.length - 1));
    }

    static int bs(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return bs(arr, target, start, mid - 1);
        } else {
            return bs(arr, target, mid + 1, end);
        }
    }
}
