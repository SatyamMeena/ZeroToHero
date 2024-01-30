package Java.Bit_Manupulation;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magic(6));
    }

    static int magic(int n) {
        int sum = 0;
        int base = 5;
        while (n > 0) {
            int num = n & 1;
            sum += num * base;
            base = base * 5;
            n = n >> 1;
        }
        return sum;
    }
}
