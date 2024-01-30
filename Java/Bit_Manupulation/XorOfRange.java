package Java.Bit_Manupulation;

public class XorOfRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = Xor(b) ^ Xor(a - 1);
        System.out.println(Xor(a));
        System.out.println(ans);
    }

    static int Xor(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
