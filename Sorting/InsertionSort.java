public class InsertionSort {
    public static int[] sortArray(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            int j = i -1;
            while(j >= 0){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i = j;
                }
                else{
                    break;
                }
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedNums = sortArray(nums);
        for(int num : sortedNums){
            System.out.print(num + " ");
        }
    }   
}
