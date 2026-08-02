public class QueueUsingArray {
    int[] queue;
    int front;
    int rear;
    int size;
    int n;
    public QueueUsingArray(int n) {
        queue = new int[n];
        front = 0;
        rear = -1;
        size = 0;
        this.n = n;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public void enqueue(int x) {
        if(isFull()) return;
        rear = (rear + 1) % n;
        queue[rear] = x;
        size++;
    }

    public void dequeue() {
        if(isEmpty()) return;
        front = (front + 1) % n;
        size--;
    }

    public int getFront() {
        if(isEmpty()) return -1;
        return queue[front];
    }

    public int getRear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.getFront()); 
        System.out.println(q.getRear()); 
        q.dequeue();
        System.out.println(q.getFront()); 
    }
}
