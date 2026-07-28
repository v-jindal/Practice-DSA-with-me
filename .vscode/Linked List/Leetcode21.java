public class Leetcode21 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = null;
        if(list1.val <= list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        ListNode temp = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = (list1 != null) ? list1 : list2;
        return head;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
