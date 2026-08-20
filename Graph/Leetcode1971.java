import java.util.ArrayList;
import java.util.List;

public class Leetcode1971 {
    boolean[] vis;
    boolean flag;
    List<List<Integer>> list;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       list = new ArrayList<>();
       vis = new boolean[n];
       for(int i = 0; i < n; i++){
        list.add(new ArrayList<>());
       } 
       for(int[] i : edges){
        list.get(i[0]).add(i[1]);
        list.get(i[1]).add(i[0]);
       }
       return helper(source, destination);
    }
    public boolean helper(int source, int dest){
        if(flag || source == dest){
            return true;
        }
        vis[source] = true;
        for(int i = 0; i < list.get(source).size(); i++){
            if(!vis[list.get(source).get(i)] && helper(list.get(source).get(i), dest))
            return true;
        }
        return false;
    }
}