package Java;

public class Shadowing {
    static int x = 1;  //where the variable in low-level scope overrides the variable of high-level scope

 public   class Inner {

      static   int x = 2;
    public static void main(String[] args) {
        value();
        System.out.println(x);
        int x = 10;
        System.out.println(x);
    }

    static void value() {
        int x = 10000;
        System.out.println(x);
    }
}
}
