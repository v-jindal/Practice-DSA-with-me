public class Leetcode1572 {
    public static int diagonalSum(int[][] mat) {
        int m = 0;
        int n = mat.length - 1;
        int sum = 0;
        while(m < mat.length){
            sum += mat[m][m];
            if(n != m){
                sum += mat[m][n];
            } 
            m++;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};    
        System.out.println(diagonalSum(mat));
    }
}
