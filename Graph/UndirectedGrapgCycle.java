import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedGrapgCycle {
    boolean flag;
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            list.add(new ArrayList<>());
        }
        for(int i[] : edges){
            int a = i[0];
            int b = i[1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i = 0; i < V; i++){
            if(flag) return true;
            if(!vis[i]){
                bfs(list, vis, i, -1);
            }
        }
        return flag;
    }
    public void bfs(List<List<Integer>> list, boolean[] vis, int node, int parent){
        vis[node] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {node, parent});
        while(!q.isEmpty() && !flag){
            int n = q.size();
            for(int i = 0; i < n; i++){
                int v[] = q.poll();
                parent = v[1];
                node = v[0];
                for(int j : list.get(node)){
                    if(!vis[j]){
                        vis[j] = true;
                        q.add(new int[]{j, node});
                    } else if(j != parent){
                        flag = true;
                        return;
                    }
                }
            }
        }
    }
}
