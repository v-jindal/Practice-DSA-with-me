import java.util.Stack;

public class Leetcode1047 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i = -1;
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
                sb.deleteCharAt(i);
                i--;
            }
            else{
                stack.push(c);
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Leetcode1047 solution = new Leetcode1047();
        System.out.println(solution.removeDuplicates("abbaca"));
        System.out.println(solution.removeDuplicates("azxxzy")); 
    }
}
