package Java.Strings;

public class LongestOldNumber {
    public static void main(String[] args) {
        String num = "239537672423884969653287101";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int n = num.length() - 1;
        while (n >= 0) {
            int currNum = num.charAt(n) - '0';
            System.out.println(currNum);
            if (currNum % 2 == 1) {
                return num.substring(0, n - 1);
            }
            n--;
        }
        return "";
    }
}
