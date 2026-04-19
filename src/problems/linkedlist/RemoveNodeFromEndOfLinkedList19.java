package problems.linkedlist;

import common.ListNode;

import java.util.List;

public class RemoveNodeFromEndOfLinkedList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode nCouter = head;
        for(int i = 1; i < n; i++) {
            nCouter = nCouter.next;
        }
        ListNode toRemove = dummy;

        while (nCouter != null) {
            nCouter = nCouter.next;
            toRemove = toRemove.next;
        }

        toRemove.next = toRemove.next.next;
        return dummy.next;
    }
}
