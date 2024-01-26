package Java.Recursion;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int arr[]) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }

}