package problems.linkedlist;

public class CopyLinkedListWithRandomPointer138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node l1 = head;
        while (l1 != null) {
            Node l2 = new Node(l1.val);
            l2.next = l1.next;
            l1.next = l2;
            l1 = l1.next.next;
        }

        l1 = head;
        Node l2 = head.next;
        while (l1 != null) {
            Node copy = l1.next;
            if (l1.random != null) {
                copy.random = l1.random.next;
            }
            l1 = copy.next;
        }
        l1 = head;
        while (l1.next != null) {
            Node copy = l1.next;
            l1.next = copy.next;
            l1 = copy;
        }


        return l2;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

