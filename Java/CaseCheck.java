package Java;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        char ch = word.trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println("Lower Case Word");
        else
            System.out.println("Upper Case Word");
    }

}
