import java.util.HashMap;
class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer, ListNode> map = new HashMap<>();
    ListNode head = new ListNode(-1, -1);
    ListNode tail = new ListNode(-1, -1);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        ListNode node = map.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        return node.val;
    }
    public void put(int key, int value) {
        if (capacity == 0)
            return;
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            node.val = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        } else {
            if (map.size() == capacity) {
                ListNode last = tail.prev;
                map.remove(last.key);
                last.prev.next = tail;
                tail.prev = last.prev;
            }
            ListNode node = new ListNode(key, value);
            map.put(key, node);
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }
    }
}
public class Leetcode146 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        System.out.println(lRUCache.get(1));
        lRUCache.put(3, 3);
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4);
        System.out.println(lRUCache.get(1));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(4));
    }
}