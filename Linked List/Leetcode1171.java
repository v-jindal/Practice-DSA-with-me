import java.util.HashMap;
import java.util.Map;
public class Leetcode1171 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        int sum = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        for(ListNode c = d; c != null; c = c.next){
            sum += c.val;
            if(map.containsKey(sum)){
                ListNode prev = map.get(sum);
                int tempSum = sum;
                ListNode temp = prev.next;
                while (temp != c) {
                    tempSum += temp.val;
                    map.remove(tempSum);
                    temp = temp.next;
                }
                prev.next = c.next;
            }
            else{
                map.put(sum, c);
            }
        }
        return d.next;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(-4);
        head.next.next.next.next.next.next = new ListNode(2);

        System.out.println("Original List:");
        printList(head);

        ListNode result = removeZeroSumSublists(head);

        System.out.println("List after removing zero-sum sublists:");
        printList(result);
    }
}
