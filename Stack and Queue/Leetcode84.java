import java.util.ArrayDeque;
import java.util.Deque;
public class Leetcode84 {
    public static int largestRectangleArea(int[] h) {
        int n = h.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || h[stack.peek()] >= h[i])) {
                int height = h[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println(result);
    }
}
