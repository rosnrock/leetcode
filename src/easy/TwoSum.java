package easy;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}
