import java.util.ArrayDeque;
import java.util.Deque; 
class InfixToPostfix{
    public static String postfix(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
            else if(c == ')'){
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else if(c == '^'){
                    stack.push(c);
                }
                else if(c == '/' || c == '*'){
                    while(!stack.isEmpty() && (stack.peek() == '/' || stack.peek() == '*' || stack.peek() == '^')){
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                }
                else{
                    while(!stack.isEmpty() && stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(postfix(s));
    }
}
