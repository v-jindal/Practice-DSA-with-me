public class Leetcode1020 {
    static int m, n, count;
    public static int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i < n; i++){
            if(grid[0][i] == 1){
                helper(0, i, grid, vis);
            } else{
                vis[0][i] = true;
            }
        }
        for(int i = 0; i < n; i++){
            if(grid[m - 1][i] == 1){
                helper(m - 1, i, grid, vis);
            } else{
                vis[m - 1][i] = true;
            }
        }
        for(int i = 0; i < m; i++){
            if(grid[i][0] == 1){
                helper(i, 0, grid, vis);
            } else{
                vis[i][0] = true;
            }
        }
        for(int i = 0; i < m; i++){
            if(grid[i][n - 1] == 1){
                helper(i, n - 1, grid, vis);
            } else{
                vis[i][n - 1] = true;
            }
        }
        count = 0;
        for(int i = 1; i < m - 1; i++){
            for(int j = 1; j < n - 1; j++){
                if(!vis[i][j]){
                    if(grid[i][j] == 1){
                        helper(i , j, grid, vis);
                    } else{
                        vis[i][j] = true;
                    }
                }
            }
        }
        return count;
    }
    public static void helper(int r, int c, int[][] grid, boolean[][] vis){
        if(r == m || r == -1 || c == n || c == -1) return;
        if(!vis[r][c] && grid[r][c] == 1){
            count++;
            vis[r][c] = true;
            helper(r + 1, c, grid, vis);
            helper(r - 1, c, grid, vis);
            helper(r, c + 1, grid, vis);
            helper(r, c - 1, grid, vis);
        }
        return;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(grid));
    }
}
