public class Leetcode724 {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum+= n;
        }
        int left = 0;
        for(int i = 0; i< nums.length ; i++){
            int right = sum - left - nums [i];
            if(right == left) return i;
            left += nums[i];
        }
        return -1;
    }
    public static void main(String [] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
