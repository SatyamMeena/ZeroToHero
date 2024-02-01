package Java.Math;

import java.util.ArrayList;

public class FactorOfANumber {
    public static void main(String[] args) {
        int n = 20;
        factor(n);
    }

    static void factor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == n) {
                System.out.print(i + " ");
            } else if (n % i == 0) {
                System.out.print(i + " ");
                arr.add(n / i);
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
