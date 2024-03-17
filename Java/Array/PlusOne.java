package Java.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits [] = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        digits[n] = digits[n] + 1;
        int carry = 0;
        while (n >= 0) {
            if (digits[n] + carry > 9) {
                carry = 1;
                digits[n] = 0;
            } else {
                digits[n] += carry;
                carry = 0;
            }
            n--;
        }
        int[] arr = new int[digits.length + 1];
        if (carry == 1) {
            arr[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                arr[i] = digits[i];
            }
            return arr;
        }
        return digits;
    }
}

/* for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits; */