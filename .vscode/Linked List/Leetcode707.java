class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}
class MyLinkedList {
    Node1 head;
    int size;
    Node1 tail;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(head == null || index >= size) return -1;
        Node1 temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node1 n = new Node1(val);
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
        Node1 n = new Node1(val);
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
            Node1 n = new Node1(val);
            Node1 temp = head;
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
            Node1 temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
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
