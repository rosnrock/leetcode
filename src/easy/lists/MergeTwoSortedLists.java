package easy.lists;

import java.util.Arrays;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        StringBuilder sb = new StringBuilder();

        while (list1 != null) {
            sb.append(list1.val).append("/");
            list1 = list1.next;
        }

        while (list2 != null) {
            sb.append(list2.val).append("/");
            list2 = list2.next;
        }

        if (sb.length() == 0)
            return null;

        int[] resArr = Arrays.stream(sb.toString().split("/")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(resArr);

        ListNode next = resArr.length > 1 ? new ListNode() : null;
        ListNode first = null;
        first = new ListNode(resArr[0], next);
        for (int i = 1; i < resArr.length; i++) {
            next.val = resArr[i];
            if (i != resArr.length - 1) {
                ListNode nextNode = new ListNode();
                next.next = nextNode;
                next = nextNode;
            }
        }

        return first;
    }
}

//        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
//        ListNode result = mergeTwoSortedLists.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4)))
//                , new ListNode(1, new ListNode(3, new ListNode(4))));
//
//         [-10,-6,-6,-6,-3,5]
//        ListNode result = mergeTwoSortedLists.mergeTwoLists(
//                new ListNode(-10, new ListNode(-6, new ListNode(-6, new ListNode(-3, new ListNode(5))))),
//                null
//        );
//
//        ListNode result = mergeTwoSortedLists.mergeTwoLists(null, null);
//
//        while (result != null) {
//            System.out.print(result.getVal() + " ");
//            result = result.getNext();
//        }

