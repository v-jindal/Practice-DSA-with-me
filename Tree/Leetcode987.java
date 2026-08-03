import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Leetcode987 {
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        helper(root, 0, 0, map);
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> tree : map.values()){
            List<Integer> inner = new ArrayList<>();
            for(PriorityQueue<Integer> pq : tree.values()){
                while(!pq.isEmpty()){
                    inner.add(pq.poll());
                }
            }
            list.add(inner);
        }
        return list;
    }
    public static void helper(TreeNode root, int h, int l, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map){
        if(root == null) return;
        if(!map.containsKey(h)){
            TreeMap<Integer, PriorityQueue<Integer>> t = new TreeMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(root.val);
            t.put(l, pq);
            map.put(h, t);
        }
        else if(!map.get(h).containsKey(l)){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(root.val);
            map.get(h).put(l, pq);
        }
        else{
            map.get(h).get(l).offer(root.val);
        }
        helper(root.left, h - 1, l + 1, map);
        helper(root.right, h + 1, l + 1, map);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(verticalTraversal(root));
    }
}
