package Java.Pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern3(5);
        System.out.println();

        pattern4(5);
        System.out.println();

        pattern5(5);
        System.out.println();

        pattern28(5);
        System.out.println();

        pattern30(5);
        System.out.println();

        pattern17(5);
        System.out.println();

    }

    static void pattern3(int n) {

        for (int row = 0; row < n; row++) {
            {
                for (int col = 0; col < n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

    static void pattern4(int n) {

        for (int row = 0; row < n; row++) {
            {
                for (int col = 0; col <= row; col++) {
                    System.out.print(col + 1 + " ");
                }
                System.out.println();
            }

        }

    }

    static void pattern5(int n) {

        for (int row = 0; row < 2 * n; row++) {
            {
                int star = row > n ? 2 * n - row : row;
                for (int col = 0; col < star; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

    static void pattern28(int n) {

        for (int row = 0; row < 2 * n; row++) {
            {
                int star = row > n ? 2 * n - row : row;
                int space = row > n ? row - n : n - row;
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < star; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

    static void pattern30(int n) {

        // for (int row = 1; row <= n; row++) {
        // {
        // int num = 2 * row - 1;
        // int space = n - row;

        // for (int i = 1; i <= space; i++) {
        // System.out.print(" ");
        // }
        // for (int col = 1; col <= num; col++) {
        // int curr = Math.abs(row - col);
        // System.out.print(curr + 1 + " ");
        // }
        // System.out.println();
        // }

        // }

        for (int row = 1; row <= n; row++) {
            {
                int num = n - row;

                for (int i = 1; i <= num; i++) {
                    System.out.print("  ");
                }
                for (int col = row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }

        }

    }

    static void pattern17(int n) {

        for (int row = 1; row <= 2 * n; row++) {
            {
                int star = (row > n) ? (2 * n - row) : row;

                for (int i = 0; i <= n - star; i++) {
                    System.out.print("  ");
                }
                for (int col = star; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= star; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }

        }

    }
}
