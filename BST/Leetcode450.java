public class Leetcode450 {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                TreeNode least = smallest(root.right);
                root.val = least.val;
                root.right = deleteNode(root.right, least.val);
            }
        } 
        return root;
    }
    public static TreeNode smallest(TreeNode tree){
        while(tree.left != null){
            tree = tree.left;
        }
        return tree;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        deleteNode(root, 5);
    }
}
