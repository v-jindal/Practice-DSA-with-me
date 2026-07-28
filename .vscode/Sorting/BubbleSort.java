public class BubbleSort {
    public static int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 1 ; j < nums.length - i; j ++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;    
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedNums = bubbleSort(nums);
        for(int num : sortedNums){
            System.out.print(num + " ");
        }
    }
}
