package problems.linkedlist;

import common.ListNode;

public class ReorderLinkedList143 {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse last part;
        ListNode curr = slow.next;
        ListNode prev = slow.next = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode end = prev;
        ListNode start = head;

        while (end != null) {
            ListNode endNext = end.next;
            ListNode startNext = start.next;
            start.next  = end;
            end.next = startNext;
            end = endNext;
            start = startNext;
        }

    }
}
