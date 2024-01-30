package Java.Bit_Manupulation;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        // System.out.println(power(256));

        int n = 256;

        if ((n & (n - 1)) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // System.out.println(n & n -1 );
    }

    static boolean power(int n) {

        while (n > 0) {

            int num = n & 1;
            n = n >> 1;

            if (num == 1) {
                if (n == 0) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}
