import java.util.LinkedList;
import java.util.Queue;

public class InterleavetheFirstHalfoftheQueuewithSecondHal {
    public static void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        int i = 0;
        while(i < (n + 1)/ 2){
            first.add(q.poll());
            i++;
        }
        while(i < n){
            second.add(q.poll());
            i++;
        }
        i = 0;
        while(i < n){
            q.add(first.poll());
            i++;
            if(!second.isEmpty()){
                q.add(second.poll());
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        rearrangeQueue(q);
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }   
    }
}
