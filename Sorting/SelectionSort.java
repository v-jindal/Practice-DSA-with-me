public class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            int index = i;
            for(int j = i+1; j < nums.length ; j++){
                if(nums[j] < nums[index]){
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedNums = selectionSort(nums);
        for(int num : sortedNums){
            System.out.print(num + " ");
        }
    }
}
