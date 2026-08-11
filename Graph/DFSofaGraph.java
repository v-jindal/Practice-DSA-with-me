import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSofaGraph {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        int n = adj.size();
        boolean vis[] = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        vis[0] = true;
        while(!stack.isEmpty()){
            List<Integer> list = adj.get(stack.peek());
            for(int i = 0; i < list.size(); i++){
                int v = list.get(i);
                if(i == list.size() - 1){
                    stack.pop();
                }
                if(!vis[v]){
                    vis[v] = true;
                    res.add(v);
                    stack.push(v);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        DFSofaGraph g = new DFSofaGraph();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            adj.add(new ArrayList<Integer>());
        }
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 4 } };
        int n = edges.length;
        for(int i = 0; i < n; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(g.dfs(adj));
    }
}
