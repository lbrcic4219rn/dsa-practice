package problems.linkedlist;

import common.ListNode;

public class ReverseNodesInKGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPRev = dummy;

        while (true) {
            ListNode kth = getKth(groupPRev, k);
            if(kth == null) break;

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPRev.next;

            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            ListNode tmp = groupPRev.next;
            groupPRev.next = kth;
            groupPRev = tmp;
        }
        return dummy.next;
    }

    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 0) {
            k--;
            curr = curr.next;
        }
        return curr;
    }
}
