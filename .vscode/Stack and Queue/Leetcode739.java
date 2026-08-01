import java.util.Stack;
public class Leetcode739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i = n -1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = stack.peek() - i;
                stack.push(i);
            }
            else{
                res[i] = 0;
                stack.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}
