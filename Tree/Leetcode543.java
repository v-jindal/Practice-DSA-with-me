public class Leetcode543 {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int h = height(root);
        System.out.println(h);
        return d;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        d = Math.max(d, left + right);
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Leetcode543().diameterOfBinaryTree(root));
    }
}
