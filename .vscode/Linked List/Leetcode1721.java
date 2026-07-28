public class Leetcode1721 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        int count = 0;
        while(count != k-1){
            count++;
            left = left.next;
        }
        int temp = left.val;
        ListNode t = left;
        while(t.next != null){
            right = right.next;
            t = t.next;
        }
        left.val = right.val;
        right.val = temp;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = swapNodes(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
