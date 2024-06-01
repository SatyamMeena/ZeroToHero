package Java.Recursion;

import java.util.*;

public class subsetOfArrayNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(subsetDuplicate(arr));
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            if (i > 0 && arr[i - 1] == arr[i]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }

        return outer;

    }

}
