package Java.Recursion;

import java.util.ArrayList;

public class DiceFace {
    public static void main(String[] args) {
        System.out.println(diceFace("", 4));

    }

    static ArrayList<String> diceFace(String p, int up) {
        if (up == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= up; i++) {
            result.addAll(diceFace(p + i, up - i));
        }
        return result;
    }
}
