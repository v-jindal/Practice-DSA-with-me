import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponentsInUndirectedGraph {
    public static ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V ; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i[] : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                ArrayList<Integer> list = new ArrayList<>();
                vis[i] = true;
                list.add(i);
                q.add(i);
                while(!q.isEmpty()){
                    for(int j = 0; j < adj.get(q.peek()).size(); j++){
                        int v = adj.get(q.peek()).get(j);
                        if(!vis[v]){
                            list.add(v);
                            q.add(v);
                            vis[v] = true; 
                        }
                    }
                    q.poll();
                }
                res.add(list);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 } };
        ArrayList<ArrayList<Integer>> res = getComponents(V, edges);
        for(ArrayList<Integer> list : res){
            System.out.println(list);
        }
    }
}
