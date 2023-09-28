package easy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }
        int result = integerSet.size();

        Iterator<Integer> setIterator = integerSet.iterator();
        for (int i = 0; i < nums.length; i++) {
            if (setIterator.hasNext()) {
                nums[i] = setIterator.next();
                setIterator.remove();
            }
        }
        return result;
    }
}
