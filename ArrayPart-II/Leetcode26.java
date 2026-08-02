public class Leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int in = 1;
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                nums[in] = nums[i];
                in++;
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Modified array: ");
        for(int i = 0; i < newLength; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
