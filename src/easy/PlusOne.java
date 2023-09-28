package easy;

// https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            digits[i] = digit + 1 == 10 ? 0 : digit + 1;
            if (digits[i] != 0)
                break;
        }

        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
