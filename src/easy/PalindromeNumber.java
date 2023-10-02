package easy;

// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        if (x / 10 == 0)
            return true;

        StringBuilder stringBuilder = new StringBuilder();
        int temp = x;
        while (temp != 0) {
            stringBuilder.append(temp % 10);
            temp /= 10;
        }
        return stringBuilder.toString().equals(x + "");
    }
}
