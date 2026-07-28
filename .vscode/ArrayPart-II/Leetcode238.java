public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int pre = 1;
        for(int i = 0; i<nums.length ;i++){
            res[i] = pre;
            pre *= nums[i];
        }
        int suf = 1;
        for(int i =nums.length-1 ; i>=0; i--){
            res[i]*= suf;
            suf *= nums[i];
        }
        return res;
    }
    public static void main(String [] args){
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
