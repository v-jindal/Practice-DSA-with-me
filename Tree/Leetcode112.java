public class Leetcode112 {
    static boolean flag;
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        flag = false;
        helper(root, targetSum);
        return flag;
    }
    public static void helper(TreeNode root, int targetSum) {
        if(flag || root == null) return;
        if(root.val == targetSum && root.left == null && root.right == null) flag = true;
        helper(root.left, targetSum - root.val);
        helper(root.right, targetSum - root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}
