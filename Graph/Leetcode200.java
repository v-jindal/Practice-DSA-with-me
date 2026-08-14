public class Leetcode200 {
    static int count, m , n;
    public static int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!vis[i][j]){
                    if(grid[i][j] == '1'){
                        count++;
                        helper(i, j, grid, vis);
                    } else{
                        vis[i][j] = true;
                        continue;
                    }
                }
            }
        }
        return count;
    }
    public static void helper(int i, int j, char[][] grid, boolean[][] vis){
        if(i == m || j == n || i <= -1 || j <= -1) return;
        if(!vis[i][j] && grid[i][j] == '1'){
            vis[i][j] = true;
            helper(i + 1, j, grid, vis);
            helper(i - 1, j, grid, vis);
            helper(i, j + 1, grid, vis);
            helper(i, j - 1, grid, vis);
        }
        return;       
    }
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
}
