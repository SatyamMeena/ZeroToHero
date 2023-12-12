package Java;

import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter value for 1st number : ");
        int a = input.nextInt();
        System.out.println("enter value for 2nd number : ");
        int b = input.nextInt();
        System.out.println("enter value for 3rd number : ");
        int c = input.nextInt();

        /*
         * Approach 1
         * if(a>b && a> c)
         * System.out.println(" 1st is greater");
         * 
         * if(b>a && b>c)
         * System.out.println(" 2nd is greater");
         * 
         * if(c>a && c>b)
         * System.out.println(" 3rd is greater");
         */

         // Print number itself
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.println("Max Number is : " + max);

    }
}
