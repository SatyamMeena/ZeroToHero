package Java;

public class CeilingOfTheArray {
    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int[] arr = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return start; // In case of floor return end 
    }
}
