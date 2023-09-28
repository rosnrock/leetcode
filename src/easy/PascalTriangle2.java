package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii/description/
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev = new ArrayList<>();
        for (int j = 1; j <= rowIndex + 1; j++) {
            List<Integer> cur = new ArrayList<>();
            for (int i = 0; i < j; i++) {
                if (i == 0 || i == j - 1) {
                    cur.add(1);
                } else {
                    cur.add(prev.get(i - 1) + prev.get(i));
                }
            }
            prev = cur;
        }

        return prev;
    }
}
