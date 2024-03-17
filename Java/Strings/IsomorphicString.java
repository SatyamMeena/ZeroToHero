package Java.Strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egcd";
        String t = "adfd";
        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
          

            if (map.containsKey(ch) == false) {
                map.put(ch, true);
                StringBuilder newStr = new StringBuilder(t.replace(t.charAt(i), ch));
                t = newStr.toString();
            }

            System.out.println(t);
        }
        return t.equals(s);
    }
}
