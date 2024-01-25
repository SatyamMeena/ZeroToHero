package Java.Recursion;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1 };
        System.out.println(maxA(arr, arr.length));
    }

    static int maxA(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], maxA(arr, n - 1));
    }
}
