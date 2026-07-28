public class Leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right=mid-1;
            else left = mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }
}
