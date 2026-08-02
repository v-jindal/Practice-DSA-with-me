import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class NextGreaterElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res.add(0, stack.peek());
                stack.push(arr[i]);
            }
            else{
                res.add(0, -1);
                stack.push(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        ArrayList<Integer> result = nextLargerElement(arr);
        System.out.println(result); 
    }
}
