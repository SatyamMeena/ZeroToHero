package Java.Strings;

public class ReverseASentance {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    // "example good a"

    static String reverseWords(String s) {
        String newStr = "";
        int space = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ' && space == 0) {
                newStr += ch;
                space++;
            } else if (ch == ' ' && space >= 1) {
                space++;
            } else {
                newStr += ch;
                space = 0;
            }
        }
        String newStr2 = "";
        String[] arr = newStr.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            newStr2 += arr[i];
            newStr2 += " ";
        }

        System.out.println(newStr2);

        return newStr2;

    }

}
