package Java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number till which you want prime number");
        int number = input.nextInt();

        System.out.println(isPrime(number));
        // String result = "2 ";

        // for (int i = 3; i < number; i++) {
        // boolean flag = true;
        // int temp = i;
        // int count = 2;
        // while (count * count < temp) {
        // if (temp % count == 0) {
        // flag = false;
        // break;
        // }
        // count++;
        // }
        // if (flag)
        // result += i + " ";
        // }
        // System.out.println(result);
    }

    // By using function
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        int count = 2;
        // boolean flag = true;
        while (count * count <= num) {
            if (num % count == 0) {
                // flag = false;
                // break;
                return false;
            }
            count++;
        }

        return true;
    }
}