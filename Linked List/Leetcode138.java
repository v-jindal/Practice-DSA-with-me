public class Leetcode138 {
    public static class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null){
            Node n = new Node(temp.val);
            n.next = temp.next;
            temp.next = n;
            temp = n.next;
        }
        Node n = head;
        Node copy = head.next;
        while(n != null ){
            n.next.random = (n.random == null) ? null : n.random.next;
            n = n.next.next;
        }
        n = head;
        Node c = copy;
        while(n != null){
            n.next = n.next.next;
            c.next = (c.next == null) ? null : c.next.next;
            c = c.next;
            n = n.next;
        }
        return copy;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);   
        Node node2 = new Node(2);   
        Node node3 = new Node(3);   
        node1.next = node2;   
        node2.next = node3;   
        node1.random = node3;   
        node2.random = node1;   
        node3.random = node1;   
        Node head = copyRandomList(node1);
        while(head != null){
            System.out.println(head.val + " " + head.random.val);
            head = head.next;
        }
    }
}
