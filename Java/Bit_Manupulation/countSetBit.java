package Java.Bit_Manupulation;

public class countSetBit {
    public static void main(String[] args) {
        System.out.println(setBit(8));
    }

    static int setBit(int n){
        int count = 0;
        while (n> 0){
            count++;

            n = n & n-1;
            // n = n - (n & -n);
        }
        return count;
    }
}
