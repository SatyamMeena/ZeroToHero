package Java.Recursion;

import java.util.ArrayList;

public class LInearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 34, 4, 4, 8 };
        int target = 4;
        // System.out.println(linear(arr, target, 0, -1));
        // ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(linearDuplicate(arr, target, 0, new
        // ArrayList<Integer>()));
        System.out.println(linearDuplicateWithoutList(arr, target, 0));
    }

    static int linear(int arr[], int target, int index, int linearIndex) {
        if (index == arr.length) {
            return linearIndex;
        }

        if (arr[index] == target) {
            linearIndex = index;
        }

        return linear(arr, target, index + 1, linearIndex);
    }

    static int linear2(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linear2(arr, target, index + 1);
    }

    static ArrayList<Integer> linearDuplicate(int arr[], int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return linearDuplicate(arr, target, index + 1, list);
    }

    // int[] arr = { 12, 3, 34, 4, 4, 8 };
    static ArrayList<Integer> linearDuplicateWithoutList(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = linearDuplicateWithoutList(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }

}
