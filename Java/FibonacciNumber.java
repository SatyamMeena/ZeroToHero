package Java;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till which you want fibonacci number : ");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        String result = first + " " + second + " ";
        for (int i = 0; i < num - 1; i++) {
            int third = first + second;
            result += third + " ";
            first = second;
            second = third;
        }
        System.out.println(result);
    }
}
