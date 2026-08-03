public class Leetcode129 {
    static int i = 0;
    static int sum = 0;
    public static int sumNumbers(TreeNode root) {
        helper(root);
        return sum;
    }
    public static void helper(TreeNode root){
        if(root == null) return;
        i = i*10 + root.val;
        if(root.left == null && root.right == null){
            sum += i;
            i /= 10;
            return;
        }
        helper(root.left);
        helper(root.right);
        i /= 10;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumNumbers(root));
    }
}
