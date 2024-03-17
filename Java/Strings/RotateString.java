package Java.Strings;

public class RotateString {
    public static void main(String[] args) {
        String s="ohbrwzxvxe", goal = "uornhegseo";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char go = goal.charAt(0); 
            System.out.println(ch + " equals " + go);

            if (ch == go) {
                flag = s.substring(i, s.length()).equals(goal.substring(0, goal.length() - i));
                System.out.println("s.substring(i,s.length()) - -> " + s.substring(i, s.length()));
                System.out.println(" goal.substring(0,goal.length() - i --> " + goal.substring(0, goal.length() - i));
                System.out.println(flag);
                flag = s.substring(0, i ).equals(goal.substring( goal.length()  - i, goal.length()));

                System.out.println("s.substring(0,i) --> " + s.substring(0, i ));
                System.out.println("goal.substring(i + 1 , goal.length()) --> " + goal.substring(goal.length() - i, goal.length()));
                System.out.println(flag);
                break;
            }

        }
        return flag;
    }
}
