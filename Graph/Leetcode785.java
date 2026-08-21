import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Leetcode785 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(color[i] == 0){
                color[i] = 1;
                q.add(i);
                if(!bfs(graph, q, color)) return false;
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, Queue<Integer> q, int[] color){
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i : graph[node]){
                if(color[i] == 0){
                    q.add(i);
                    color[i] = color[node] == 1 ? 2 : 1;
                } else if(color[i] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}
