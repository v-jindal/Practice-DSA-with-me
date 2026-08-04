public class Leetcode700 {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        if(root.val > val){
            root = searchBST(root.left, val);
        } else{
            root = searchBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        searchBST(root, 5);
    }
}
