package Java.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(30203010));
    }

    // static int countZ(int n, int count) {
    // if (n%10 == n){
    // return count;
    // }

    // if (n%10 == 0){
    // count++;
    // }
    // return countZ(n/10, count);
    // }

    static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;

        if (rem == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }
    }
}
