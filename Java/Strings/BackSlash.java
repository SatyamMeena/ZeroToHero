package Java.Strings;

public class BackSlash {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        backspaceCompare(s, t);
    }

    public static boolean backspaceCompare(String s, String t) {
        int count = 0;
        StringBuilder st1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '#') {
                count++;
            } else if (count > 0 && ch != '#') {
                count--;
            }else {
                st1.append(ch);
            }
        }

          StringBuilder st2 = new StringBuilder();
        for (int i = t.length() - 1; i >= 0; i--) {
            char ch = t.charAt(i);
            if (ch == '#') {
                count++;
            } else if (count > 0 && ch != '#') {
                count--;
            }else {
                st2.append(ch);
            }
        }
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        if (st1.toString() == st2.toString()){
            return true;
        }
        else {
            return false;
        }
    }
}
