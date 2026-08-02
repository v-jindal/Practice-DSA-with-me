class Node2 {
    int data;
    Node2 next;
    Node2(int val) {
    data = val;
    next = null;
    }
}
public class QueueUsingLinkedList {
    public QueueUsingLinkedList() {
        rear = new Node2(0);
        front = rear;
        size = 0;
    }
    Node2 front;
    Node2 rear;
    int size;
    public boolean isEmpty() {
        return size == 0;
    }
    public void enqueue(int x) {
        Node2 n = new Node2(x);
        rear.next = n;
        rear = rear.next;
        size++;
    }
    public void dequeue() {
        if(size == 0) return;
        front = front.next;
        size--;
    }
    public int getFront() {
        if(size == 0) return -1;
        return front.next.data;
    }
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.getFront()); 
        q.dequeue();
        System.out.println(q.getFront()); 
    }
}
