package easy;

// https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
    public int climbStairs(int n) {

        if (n <= 3)
            return n;

        int prev = 2;
        int answer = 3;
        while (n - 3 != 0) {
            int tmp = answer;
            answer = prev + answer;
            prev = tmp;
            n--;
        }

        return answer;
    }
}
