import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSofGraph {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();
        vis[0] = true;
        Queue<Integer> q = new LinkedList<>();
        res.add(0);
        q.add(0);
        while(!q.isEmpty()){
            int v = q.poll();
            ArrayList<Integer> list = adj.get(v);
            for(int i = 0; i < list.size(); i++){
                int neigh = list.get(i);
                if(!vis[neigh]){
                    vis[neigh] = true;
                    res.add(neigh);
                    q.add(neigh);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            adj.add(new ArrayList<>());
        }
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 4 } };
        int n = edges.length;
        for(int i = 0; i < n; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(bfs(adj));
    }
}
