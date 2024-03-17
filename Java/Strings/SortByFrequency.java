package Java.Strings;
import java.util.HashMap;

public class SortByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println("Ans : " + frequencySort(s));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
       return "";
    }

}
