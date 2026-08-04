public class Leetcode230 {
    static int ans = 0;
    static int count = 0;
    public static int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }
    public static void helper(TreeNode root, int k){
        if(root == null || count >= k) return;
        helper(root.left, k);
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        helper(root.right, k);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int res = kthSmallest(root, 1);
        System.out.println(res);
    }
}
