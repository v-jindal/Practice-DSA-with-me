import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyListTraversal {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < V; i++){
            list.add(new ArrayList<Integer>());
        }
        int n = edges.length;
        for(int i = 0; i < n; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        return list;
    }
    public static void main(String[] args) {
        GraphAdjacencyListTraversal g = new GraphAdjacencyListTraversal();
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 4 } };
        int V = 5;
        System.out.println(g.printGraph(V, edges));
    }
}
