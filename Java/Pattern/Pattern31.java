package Java.Pattern;

public class Pattern31 {
    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int n) {
      
        int original = n;
          n = 2 * n;
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {
                int print = original + 1 -  Math.min(Math.min(row, col), Math.min(n - col, n - row));
                System.out.print(print + " ");
            }

            System.out.println();
        }
    }
}
