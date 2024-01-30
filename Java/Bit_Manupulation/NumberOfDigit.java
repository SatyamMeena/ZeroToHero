package Java.Bit_Manupulation;

public class NumberOfDigit {
    public static void main(String[] args) {
        System.out.println(digit(6, 10));
    }

    static int digit(int n, int b) {
        return (int) (Math.log(n) / Math.log(b)) + 1;
    }

}
