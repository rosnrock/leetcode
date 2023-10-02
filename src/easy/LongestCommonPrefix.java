package easy;

// https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0].length() == 0 ? "" : strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
