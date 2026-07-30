public class Leetcode706 {
    public static class Node{
        int key;
        int val;
        Node next;
        public Node(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
    Node[] map;
    int size;
    public Leetcode706() {
        size = 50000;
        map = new Node[size];
    }
    public void put(int key, int value) {
        Node n;
        if(map[key % size] == null){
            n = new Node(key, value);
            map[key % size] = n;
        }
        else{
            n = map[key % size];
            while(n.next != null){
                if(n.key == key){
                    n.val = value;
                    return;
                }
                n = n.next;
            }
            if(n.key == key){
                n.val = value;
                return;
            }
            Node newNode = new Node(key, value);
            n.next = newNode;
        }
    }
    
    public int get(int key) {
        int p = key % size;
        Node n = map[p];
        while( n != null){
            if(n.key == key) return n.val;
            n = n.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int p = key % size;
        if(map[p] == null) return;
        else{
            Node n = map[p];
            if(n.key == key){
                map[p] = map[p].next;
                return;
            }
            else{
                while(n.next != null && n.next.key != key){
                    n = n.next;
                }
                if(n.next != null){
                    n.next = n.next.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        Leetcode706 myHashMap = new Leetcode706();
        myHashMap.put(1, 1); 
        myHashMap.put(2, 2); 
        System.out.println(myHashMap.get(1));   
        System.out.println(myHashMap.get(3));    
        myHashMap.put(2, 1); 
        System.out.println(myHashMap.get(2));    
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2));    
    }
}
