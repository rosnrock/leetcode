package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int j = 1; j <= numRows; j++) {
            List<Integer> cur = new ArrayList<>();
            List<Integer> prev = new ArrayList<>();
            if (result.size() > 0) {
                prev = result.get(result.size() - 1);
            }
            for (int i = 0; i < j; i++) {
                if (i == 0 || i == j - 1) {
                    cur.add(1);
                } else {
                    cur.add(prev.get(i - 1) + prev.get(i));
                }
            }
            result.add(cur);
        }

        return result;
    }
}
