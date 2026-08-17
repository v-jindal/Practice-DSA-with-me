public class Leetcode130 {
    static int m, n;
    public static void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        boolean vis[][] = new boolean[m][n];
        for(int j = 0; j < n; j++){
            if(board[0][j] == 'O'){
                dfsBorder(0, j, vis, board);
            }
            if(board[m - 1][j] == 'O'){
                dfsBorder(m - 1, j, vis, board);
            }
        }
        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O'){
                dfsBorder(i, 0, vis, board);
            }
            if(board[i][n - 1] == 'O'){
                dfsBorder(i, n - 1, vis, board);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!vis[i][j]) board[i][j] = 'X';
            }
        }
    }
    public static void dfsBorder(int i, int j, boolean[][] vis, char[][] board){
        if(i < 0 || j < 0 || i == m || j == n) return;
        if(board[i][j] == 'O' && !vis[i][j]){
            vis[i][j] = true;
            dfsBorder(i + 1, j, vis, board);
            dfsBorder(i - 1, j, vis, board);
            dfsBorder(i, j + 1, vis, board);
            dfsBorder(i, j - 1, vis, board);
        }
    }
    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
