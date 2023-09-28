package easy;

// https://leetcode.com/problems/remove-element/description/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int countEls = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[countEls] = nums[i];
                countEls++;
            }
        }

        return countEls;

//        List<Integer> answer = new ArrayList<>();
//        for (int num : nums) {
//            if (num != val)
//                answer.add(num);
//        }
//
//        for (int i = 0; i < answer.size(); i++) {
//            nums[i] = answer.get(i);
//        }
//
//        return answer.size();
    }
}
