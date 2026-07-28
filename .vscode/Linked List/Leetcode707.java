class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyLinkedList {
    Node head;
    int size;
    Node tail;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(head == null || index >= size) return -1;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        size++;
        if(head == null){
            head = tail = n;
        }
        else{
           n.next = head;
           head = n;  
        }
    }
    
    public void addAtTail(int val) {
        size++;
        Node n = new Node(val);
        if(head == null){
            head = tail = n;
        }
        else{
           tail.next = n;
           tail = n;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node n = new Node(val);
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }

    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || head == null ) return;
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
        } 
        else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp. next == null){
                tail = temp;
            }
            size--;
        }
    }
}
public class Leetcode707 {
        public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);    // linked list becomes 1->2->3
        System.out.println(obj.get(1));            // returns 2
        obj.deleteAtIndex(1);    // now the linked list is 1-> 3
        System.out.println(obj.get(1));           // returns 3
    }
}
