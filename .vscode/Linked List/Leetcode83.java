public class Leetcode83 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head; 
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Leetcode83 solution = new Leetcode83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);
        System.out.print("Result after removing duplicates: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
