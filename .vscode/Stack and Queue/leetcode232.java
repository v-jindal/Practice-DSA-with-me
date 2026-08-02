import java.util.Stack;
class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    public void shuffle(Stack<Integer> input){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
    public int pop() {
        shuffle(input);
        return output.pop();
    }
    
    public int peek() {
        shuffle(input);
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
public class leetcode232 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek()); 
        System.out.println(q.pop());  
        System.out.println(q.empty()); 
    }
}