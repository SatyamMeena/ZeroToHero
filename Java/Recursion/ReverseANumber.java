package Java.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        // System.out.println(reverse(1842, 0));
        // System.out.println(rev2(1842));
        System.out.println(palindrome(1234321));
    }

    // static int reverse(int n, int temp) {
    // if (n % 10 == n)
    // return n % 10 + temp * 10;
    // temp = n % 10 + temp * 10;
    // return reverse(n / 10, temp);

    // }

    static int rev2(int n) {
        int digit = (int) Math.log10(n) + 1;

        return helper(n, digit);
    }

    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }

    static boolean palindrome(int n) {
        return n == rev2(n);
    }
}
