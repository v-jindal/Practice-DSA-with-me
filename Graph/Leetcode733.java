public class Leetcode733 {
    static int m, n;
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        if(image[sr][sc] == color) return image;
        boolean[][] vis = new boolean[m][n];
        int ini = image[sr][sc];
        helper(image, sr, sc, ini, color, vis);
        return image;
    }
    public static void helper(int[][] image, int sr, int sc, int ini, int color, boolean[][] vis){
        if(sr == m || sr == -1 || sc == n || sc == -1) return;
        if(!vis[sr][sc] && image[sr][sc] == ini){
            vis[sr][sc] = true;
            image[sr][sc] = color;
            helper(image, sr + 1, sc, ini, color, vis);
            helper(image, sr - 1, sc, ini, color, vis);
            helper(image, sr, sc + 1, ini, color, vis);
            helper(image, sr, sc - 1, ini, color, vis);
        }
        return;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(floodFill(image, sr, sc, color));
    }
}
