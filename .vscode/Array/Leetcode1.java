import java.util.Arrays;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int aux[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int first = -1;
        int second = -1;
        while(i<j){
            if(nums[i] + nums[j] == target){
                first = i;
                second = j;
                break;
            }
            else if(nums[i] + nums[j] > target) j--;
            else i++;
        }
        int k=-1,l=-1;
        for(int n=0; n<aux.length;n++){
            if(aux[n] == nums[first] && k == -1) k = n;
            else if(aux[n] == nums[second] && l == -1) l = n;
            if(k != -1 && l != -1) break;
        }
        return new int[]{k, l};
    }
    public static void main(String[] args) {
        
    }
}
