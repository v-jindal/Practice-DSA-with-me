import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReversefirstKofQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if(k <= 0 || k > n || q.isEmpty()) return q;
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        while(i < k){
            stack.push(q.poll());
            i++;
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        while(i < n){
            q.add(q.poll());
            i++;
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        Queue<Integer> result = reverseFirstK(q, k);    
        while(!result.isEmpty()){
            System.out.print(result.poll() + " ");
        }
    }
}
