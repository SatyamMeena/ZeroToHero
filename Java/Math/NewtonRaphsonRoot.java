package Java.Math;

public class NewtonRaphsonRoot {
    public static void main(String[] args) {
        System.out.println(root(40));
    }

    static double root(int n) {
        double x = n;
        double root;

        while (true) {

            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {   
                break;
            }
            x = root;

        }
        return root;
    }

}
