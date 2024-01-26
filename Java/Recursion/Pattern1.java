package Java.Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5, 0);
    }

    static void pattern1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) { 
            pattern1(row, col + 1);
            System.out.print(" * ");
            // pattern1(row, col + 1);
        } else {
            pattern1(row - 1, 0);
            System.out.println();
        
        }
    }
}
