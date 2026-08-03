import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Leetcode103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 0;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            for(int k = 0; k < n; k ++){
                l.add(q.peek().val);
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                q.poll();
            }
            if(i % 2 == 0) list.add(l);
            else {
                Collections.reverse(l);
                list.add(l);
            }
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = zigzagLevelOrder(root);
        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
}
