public class Leetcode169 {
    public static int majorityElement(int[] nums) {
        int king=0;
        int count=0;
        for(int n:nums){
            if(count==0) king=n;
            if(king==n) count++;
            else count--;
        }
        return king;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
