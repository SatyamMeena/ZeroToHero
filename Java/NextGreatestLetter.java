package Java;

public class NextGreatestLetter {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j' };
        char target = 'a';

        // char[] arr = { 'c', 'c', 'c', 'c', 'd' };
        // char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
