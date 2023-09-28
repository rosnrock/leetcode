package easy;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                index = i;
                break;
            }
        }

        return index == -1 ? nums.length : index;
    }
}
