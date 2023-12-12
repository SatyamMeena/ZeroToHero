package Java;

public class ArmstrongNumber {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {

            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;

        }
        return sum == temp;
    }
}
