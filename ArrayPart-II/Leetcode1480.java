public class Leetcode1480 {
    public static int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String [] args){
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
