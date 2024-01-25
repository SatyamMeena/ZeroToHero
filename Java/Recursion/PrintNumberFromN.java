package Java.Recursion;

public class PrintNumberFromN {
    public static void main(String[] args) {
        printN(5);
        System.out.println(" -- ");
        printRev(5);
    }

    static void printN(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printN(n-1);

    }

    static void printRev(int n){
        if (n == 0){
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
}
