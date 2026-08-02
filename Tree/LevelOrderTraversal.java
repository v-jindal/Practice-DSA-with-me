import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode c = q.poll();
                l.add(c.val);
                if(c.left != null) q.add(c.left);
                if(c.right != null) q.add(c.right);
            } 
            list.add(l);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}
