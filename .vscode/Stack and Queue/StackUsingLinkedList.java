class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {
    Node n;
    int i = 0;
    public StackUsingLinkedList() {
    }
    public boolean isEmpty() {
        return n == null;
    }

    public void push(int x) {
        Node top = new Node(x);
        top.next = n;
        n = top;
        i++;
    }

    public void pop() {
        if(n != null){
            n = n.next;
            i--;
        }
    }

    public int peek() {
        if(isEmpty()) return -1;
        return n.data;
    }

    public int size() {
        return i;
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}