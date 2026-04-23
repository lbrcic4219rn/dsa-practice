package problems.linkedlist;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node prev = null;
    Node next = null;

    Node (int key, int value ) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache146 {

    private int cap;
    private Map<Integer, Node> cache = new HashMap<>();
    private Node left = new Node(0, 0);
    private Node right = new Node(0, 0);

    LRUCache146(int capacity) {
        this.cap = capacity;
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if (cache.size() > cap) {
           Node lru = this.left.next;
           remove(lru);
           cache.remove(lru.key);
        }
    }
}


