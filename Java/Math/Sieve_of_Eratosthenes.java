package Java.Math;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = true;
        // }

        // for (int i = 2; i < Math.sqrt(n); i++) {
        // if (arr[i]) {
        // if (prime(i)) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (j % i == 0) {
        // arr[j] = false;
        // }
        // }
        // }

        // } else {
        // continue;
        // }
        // }

        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }

    }

    // static boolean prime(int n) {
    // if (n == 1) {
    // return true;
    // }

    // int c = 2;

    // while (c * c < n) {
    // if (n % c == 0) {
    // return false;
    // }
    // c++;
    // }
    // return true;
    // }
}
