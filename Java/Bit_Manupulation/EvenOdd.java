package Java.Bit_Manupulation;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(47));
    }

    static boolean isOdd (int n ){
        return (n & 1) == 1;
    }
}
