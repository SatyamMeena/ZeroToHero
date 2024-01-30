package Java.Bit_Manupulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 3, 6, 3, 4, 4 };
        System.out.println(find(arr));
    }

    static int find(int arr[]) {
        int uniq = 0;
        for (int i : arr) {
            uniq ^= i;
        }

        return uniq;
    }
}
