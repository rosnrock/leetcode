package easy;

import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        int countAdd = 0;
        int countRemove = 0;
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
                countAdd++;
            } else {
                switch (c) {
                    case ')' -> {
                        if (characters.isEmpty() || characters.pop() != '(') return false;
                    }
                    case '}' -> {
                        if (characters.isEmpty() || characters.pop() != '{') return false;
                    }
                    case ']' -> {
                        if (characters.isEmpty() || characters.pop() != '[') return false;
                    }
                }
                countRemove++;
            }
        }

        return countAdd == countRemove;
    }
}
