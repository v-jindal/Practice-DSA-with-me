import java.util.Stack;

public class Leetcode430 {
    public static class Node {
        int val;
        Node prev;
        Node next;
        Node child;
        public Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
            this.child = null;
        }
    }
    public static Node flatten(Node head) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while(temp != null){
            if(temp.child != null){
                if(temp.next != null){
                    stack.push(temp.next);
                }
                temp.next = temp.child;
                temp.next.prev = temp;
                temp.child = null;
            }
            if(temp.next == null && !stack.isEmpty()){
                temp.next = stack.pop();
                temp.next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);   
        Node node2 = new Node(2);   
        Node node3 = new Node(3);   
        Node node4 = new Node(4);   
        Node node5 = new Node(5);   
        Node node6 = new Node(6);   
        node1.next = node2;   
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.child = node4;
        node4.next = node5;
        node5.prev = node4;
        node5.next = node6;
        node6.prev = node5;
        Node head = flatten(node1);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
