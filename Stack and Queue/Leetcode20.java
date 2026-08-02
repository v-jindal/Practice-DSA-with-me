import java.util.Stack;
public class Leetcode20 {
    private static boolean isBalanced(char b, char c){
        if((c == '(' && b == ')') || (c == '{' && b == '}') || (c == '[' && b == ']')) return true;
        return false;
    }
    public static boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char b : s.toCharArray()){
            if(b == '(' || b == '{' || b == '['){
                stack.push(b);
            }
            else if(stack.isEmpty() || !isBalanced(b, stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()")); 
        System.out.println(isValid("()[]{}")); 
        System.out.println(isValid("(]"));
    }
}
