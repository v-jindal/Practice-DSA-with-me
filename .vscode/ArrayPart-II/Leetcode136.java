public class Leetcode136 {
    public static int singleNumber(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            n^=nums[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println("Single number is: " + singleNumber(arr));
    }
}
