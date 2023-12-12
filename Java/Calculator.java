package Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {

            System.out.print("Enter operation you want to perform : ");
            String ch = input.next();
            char operation = ch.trim().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
                System.out.print("Enter two Numbers : ");
                int a = input.nextInt();
                int b = input.nextInt();

                if (operation == '+')
                    ans = a + b;

                if (operation == '-')
                    ans = a - b;

                if (operation == '*')
                    ans = a * b;

                if (operation == '/')
                    if (b != 0)
                        ans = a / b;

                if (operation == '%')
                    ans = a % b;
                System.out.println("The answer is : " + ans);
            }

            else if (operation == 'x' || operation == 'X')
                break;
            else
                System.out.println("Invalid Operation");
        }

    }

}
