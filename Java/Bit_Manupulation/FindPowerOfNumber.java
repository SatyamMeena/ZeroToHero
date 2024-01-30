package Java.Bit_Manupulation;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        // 3^6

        int base = 2;
        int n = 6;
        int sum = 1;

        while (n > 0) {
            int num = n & 1;

            if ((num & 1) == 1) {
                sum *= base;
            }

            n = n >> 1;
            base = base * base;

        }
        System.out.println(sum);
    }
}
