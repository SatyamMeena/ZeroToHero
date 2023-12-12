package Java;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Anime Name");
        String name = input.next();

        // switch (name) {
        // case "jjk":
        // System.out.println("jujutsu kaisen");
        // break;
        // case "naruto":
        // System.out.println("Enter the character you like");
        // String character = input.next();
        // switch (character) {
        // case "naruto":
        // System.out.println("main character");
        // break;
        // case "madara":
        // System.out.println("ghost");
        // break;
        // default:
        // System.out.println("no character matched");
        // break;
        // }
        // break;
        // default:
        // System.out.println("no anime matched");
        // break;
        // }

        //Enhanced switch 
        switch (name) {
            case "jjk" -> System.out.println("jujutsu kaisen");
            case "naruto" -> {
                System.out.println("Enter the character you like");
                String character = input.next();
                switch (character) {
                    case "naruto" -> System.out.println("main character");
                    case "madara" -> System.out.println("ghost");
                    default -> System.out.println("no character matched");
                }
            }
            default -> System.out.println("no anime matched");

        }
    }

}
