package Java.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3 };
        System.out.println(missingNumber(arr));

    }

    static public int missingNumber(int[] arr) {
        int len = arr.length;
        int i = 0;

        while (i < len) {
            int pos = arr[i];
            if (arr[i] < len && arr[i] != arr[pos]) {
                swap(arr, i, pos);
            } else {
                i++;
            }
        }

        for (int j = 0; j < len; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return len;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
