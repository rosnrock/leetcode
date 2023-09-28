package easy;

// https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

//        for (int i = 0; i < nums2.length; i++) {
//            nums1[m++] = nums2[i];
//        }
//
//        Arrays.sort(nums1);

//        int pointer = m - 1;
//        for (int i = 0; i < nums2.length; i++) {
//            if (pointer > 0 && nums2[i] < nums1[pointer]) {
//                int tmp = nums1[pointer];
//                nums1[pointer++] = nums2[i];
//                nums1[pointer] = tmp;
//            } else {
//                nums1[++pointer] = nums2[i];
//            }
//        }

        int index1 = m - 1;
        int index2 = n - 1;
        int indexMerge = m + n - 1;

        while (index2 >= 0) {
            if (index1 >= 0 && nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
