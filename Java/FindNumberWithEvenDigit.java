package Java;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumberWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = FindEvenDigit(nums);
        System.out.println(ans);
    }

    static int FindEvenDigit(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digit = 0; //    int digit = (int) (Math.log10(num))+1;
            while (num > 0) {
                num = num / 10;
                digit++;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
