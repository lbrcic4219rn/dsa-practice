package problems.linkedlist;

public class CopyLinkedListWithRandomPointer138 {
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return null;
        }
        RandomNode l1 = head;
        while (l1 != null) {
            RandomNode l2 = new RandomNode(l1.val);
            l2.next = l1.next;
            l1.next = l2;
            l1 = l1.next.next;
        }

        l1 = head;
        RandomNode l2 = head.next;
        while (l1 != null) {
            RandomNode copy = l1.next;
            if (l1.random != null) {
                copy.random = l1.random.next;
            }
            l1 = copy.next;
        }
        l1 = head;
        while (l1.next != null) {
            RandomNode copy = l1.next;
            l1.next = copy.next;
            l1 = copy;
        }


        return l2;
    }
}

class RandomNode {
    int val;
    RandomNode next;
    RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

