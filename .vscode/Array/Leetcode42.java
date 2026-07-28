public class Leetcode42 {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(height[left], leftMax);
                if (height[left] < leftMax)
                    res += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(height[right], rightMax);
                if (height[right] < rightMax)
                    res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }
}
