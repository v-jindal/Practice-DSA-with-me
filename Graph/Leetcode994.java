import java.util.LinkedList;
import java.util.Queue;

public class Leetcode994 {
    int m, n, min, fresh;
    Queue<int[]> q = new LinkedList<>();
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                else if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                } 
            }
        }
        if(fresh == 0) return 0;
        while(!q.isEmpty() && fresh > 0){
            int s = q.size();
            for(int i = 0; i < s; i++){
                int[] rotten = q.poll();
                bfs(rotten[0], rotten[1], grid);
            }
            min++;
        }
        if(fresh == 0) return min;
        return  -1;
    }
    public void bfs(int i, int j, int[][] grid){
        if(i > 0 && grid[i - 1][j] == 1){
            fresh--;
            grid[i - 1][j] = 2;
            q.add(new int[]{i - 1, j});
        } 
        if(i < m - 1 && grid[i + 1][j] == 1){
            fresh--;
            grid[i + 1][j] = 2;
            q.add(new int[]{i + 1, j});
        }
        if(j > 0 && grid[i][j - 1] == 1){
            fresh--;
            grid[i][j - 1] = 2;
            q.add(new int[]{i , j - 1});
        }
        if(j < n - 1 && grid[i][j + 1] == 1){
            fresh--;
            grid[i][j + 1] = 2;
            q.add(new int[]{i , j + 1});
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(new Leetcode994().orangesRotting(grid));
    }
}
