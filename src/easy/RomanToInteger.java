package easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {
    public static int romanToInt(String s) {

        Map<String, Integer> romanIntVocabulary = new HashMap<>();
        romanIntVocabulary.put("I", 1);
        romanIntVocabulary.put("IV", 4);
        romanIntVocabulary.put("V", 5);
        romanIntVocabulary.put("IX", 9);
        romanIntVocabulary.put("X", 10);
        romanIntVocabulary.put("XL", 40);
        romanIntVocabulary.put("L", 50);
        romanIntVocabulary.put("XC", 90);
        romanIntVocabulary.put("C", 100);
        romanIntVocabulary.put("CD", 400);
        romanIntVocabulary.put("D", 500);
        romanIntVocabulary.put("CM", 900);
        romanIntVocabulary.put("M", 1000);

        int answer = 0;
        String[] toProcess = s.split("");
        for (int i = 0; i < toProcess.length; i++) {
            if (i != toProcess.length - 1) { // если не последний символ
                if (romanIntVocabulary.containsKey(toProcess[i] + toProcess[i + 1])) {
                    answer += romanIntVocabulary.get(toProcess[i] + toProcess[i + 1]);
                    i++;
                } else {
                    answer += romanIntVocabulary.get(toProcess[i]);
                }
            } else {
                answer += romanIntVocabulary.get(toProcess[i]);
            }
        }

        return answer;
    }
}
