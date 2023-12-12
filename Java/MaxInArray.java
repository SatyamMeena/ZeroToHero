package Java;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(max(arr));
    }

    static int max(int array[]) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
