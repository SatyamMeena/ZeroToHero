package Java.Recursion;

public class FibbonaciNumber {
    public static void main(String[] args) {
        System.out.println(print(8));
    }

    static int print(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int sum = print(n - 1) + print(n - 2);
        return sum;
    }
}
