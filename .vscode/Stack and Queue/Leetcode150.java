import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode150 {
    public static int evalRPN(String[] tokens) {
        int n = tokens.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for(int i = 0; i < n; i++){
            String c = tokens[i];
            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*") ){
                if(c.equals("+")){
                    int a = stack.pop();
                    int b = stack.pop(); 
                    stack.push(b + a);
                }
                else if(c.equals("-") ){
                    int a = stack.pop();
                    int b = stack.pop(); 
                    stack.push(b - a);
                }
                else if(c.equals("/")){
                    int a = stack.pop();
                    int b = stack.pop(); 
                    stack.push(b / a);
                }
                else{
                    int a = stack.pop();
                    int b = stack.pop(); 
                    stack.push(b * a);
                }
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evalRPN(tokens);
        System.out.println(result); 
    }
}
