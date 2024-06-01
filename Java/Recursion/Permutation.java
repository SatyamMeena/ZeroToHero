package Java.Recursion;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        String p = "";
        System.out.println(perSet(p, str));
        ;
    }

    static ArrayList<String> perSet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> result = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            String ans = first + ch + second;
            result.addAll(perSet(ans, up.substring(1)));
        }
        return result;
    }
}
