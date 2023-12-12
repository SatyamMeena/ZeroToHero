package Java;

import java.util.Scanner;

public class OccuranceOfParticularNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt(); // 1378797

        System.out.println("Enter the number whose occurance need to be find");
        int occ = input.nextInt(); // 7
        int count = 0;
        while (num > 0) {
            int last = num % 10;
            if (last == occ)
                count++;
            num = num / 10;
        }

        System.out.println("Occurance is : " + count);

    }
}