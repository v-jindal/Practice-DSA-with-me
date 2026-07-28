import java.util.Arrays;
public class Leetcode945 {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int move = nums[i-1] - nums[i] + 1;
                count += move;
                nums[i] += move;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}
