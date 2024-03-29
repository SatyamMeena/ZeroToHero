package Java.Math;

public class PrimeWithInRange {
    public static void main(String[] args) {
        int n = 40;

        for (int i = 1; i < n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int n) {
        if (n == 1) {
            return true;
        }

        int c = 2;

        while (c * c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
