public class Leetcode108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        TreeNode tree = helper(left, right, nums);
        return tree;
    }
    public static TreeNode helper(int left, int right, int[] nums){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(left, mid - 1, nums);
        node.right = helper(mid + 1, right, nums);
        return node;
    }
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);
    }
}
