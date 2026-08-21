import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TopoloficalSortUsingDFS {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        boolean vis[] = new boolean[V];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < V; i++){
            list.add(new ArrayList<>());
        }
        for(int i[] : edges) list.get(i[0]).add(i[1]);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(list, vis, stack, i);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()) res.add(stack.pop());
        return res;
    }
    void dfs(List<List<Integer>> list, boolean vis[], Deque<Integer> stack, int i){
        vis[i] = true;
            for(int index : list.get(i)){
                if(!vis[index])
                dfs(list, vis, stack, index);
            }
        stack.push(i);
    }
}
