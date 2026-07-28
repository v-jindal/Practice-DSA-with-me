public class Leetcode643 {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i= 0;i< k;i++){
            sum += nums[i];
        }
        double max = sum/k;
        for(int i=k; i<nums.length; i++){
            sum -= nums[i-k];
            sum += nums[i];
            max = Math.max(sum/k, max); 
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
