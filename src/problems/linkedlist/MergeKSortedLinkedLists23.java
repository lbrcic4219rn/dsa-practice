package problems.linkedlist;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLinkedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        while (lists.length > 1) {
            List<ListNode> mergedLists = new ArrayList<>();
            for (int i = 0; i < lists.length; i += 2) {
                ListNode l1 = lists[i];
                ListNode l2 = (i + 1) < lists.length ? lists[i + 1] : null;
                mergedLists.add(mergeTwoLists(l1, l2));
            }
            lists = mergedLists.toArray(new ListNode[0]);
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        l1 = l1 != null ? l1 : l2;
        curr.next = l1;

        return dummy.next;
    }
}
