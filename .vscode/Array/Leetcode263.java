public class Leetcode263 {
    public void moveZeroes(int[] nums) {
        int i = -1;
        int j = 0;
        while(j<nums.length){
            if(nums[j] == 0 && i==-1){
                i=j;
                j++;
            }
            else if(i!=-1){
                if(nums[j] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                    i++;
                }
                else{
                    j++;
                }
            } 
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
