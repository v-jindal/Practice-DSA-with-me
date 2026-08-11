public class Leetcode547 {
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                count++;
                helper(isConnected, vis, i, n);
            }
        }
        return count;
    }
    public static void helper(int[][] isConnected, boolean[] vis, int node, int n){
        if(!vis[node]){
            vis[node] = true;
            for(int i = 0; i < n; i++){
                if(i == node) continue;
                if(isConnected[node][i] == 1){
                    helper(isConnected, vis, i, n);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        System.out.println(findCircleNum(isConnected));
    }
}
