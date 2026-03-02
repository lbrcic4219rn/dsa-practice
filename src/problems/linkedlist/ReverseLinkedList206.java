package problems.linkedlist;

import common.ListNode;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        if(head.next.next == null) {
            head.next.next = head;
            return head.next;
        }
        return null;
    }
}
