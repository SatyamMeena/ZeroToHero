package Java.SearchingQuestion;

public class SqrtRoot {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int start = 1;
        int end = x / 2;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
