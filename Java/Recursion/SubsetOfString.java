package Java.Recursion;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        String str = "abc";
        String result = "";
        System.out.println(subset(result, str));
    }

    static ArrayList<String> subset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }

        ArrayList<String> right = subset(p + up.charAt(0), up.substring(1));
        ArrayList<String> left = subset(p, up.substring(1));
        right.addAll(left);

        return right;
    }
}
