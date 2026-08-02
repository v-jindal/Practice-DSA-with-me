import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeSort {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int nums[], int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        sort(nums, start, mid, end);
    }

    public static void sort(int nums[], int start, int mid, int end) {
        List<Integer> list = new ArrayList<>();
        int low = start;
        int right = mid + 1;

        while (start <= mid && right <= end) {
            if (nums[start] <= nums[right]) {
                list.add(nums[start++]);
            } else {
                list.add(nums[right++]);
            }
        }

        while (start <= mid) list.add(nums[start++]);
        while (right <= end) list.add(nums[right++]);

        for (int i = low; i <= end; i++) {
            nums[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }    
}