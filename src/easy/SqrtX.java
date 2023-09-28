package easy;

// https://leetcode.com/problems/sqrtx/description/
public class SqrtX {
    public int mySqrt(int x) {
        long answer = 0;
        while (answer * answer < x) {
            answer++;
        }
        return answer * answer > x ? (int) answer - 1: (int) answer;
    }
}
