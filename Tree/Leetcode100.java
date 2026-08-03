public class Leetcode100 {
    static boolean flag;
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        flag = true;
        helper(p, q);
        return flag;
    }
    public static void helper(TreeNode p, TreeNode q){
        if(p == null && q == null) return;
        if((p == null && q != null) || (p != null && q == null) || p.val != q.val){
            flag = false;
        }
        if(!flag) return;
        helper(p.left, q.left);
        helper(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(isSameTree(p, q));
    }
}
