package Java.Strings;

import java.util.Arrays;

public class ValidateAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "dog";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() > t.length() || s.length() < t.length()) {
            return false;
        }

        int[] arr = new int[26];
        int[] arr2 = new int[26];

        for (char ch : s.toCharArray()) {
            arr[ch - 'a'] = arr[ch - 'a'] + 1;
        }

        System.out.println(Arrays.toString(arr));
        for (char ch : t.toCharArray()) {
            arr2[ch - 'a'] = arr2[ch - 'a'] + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
