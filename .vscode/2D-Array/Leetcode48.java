public class Leetcode48 {
    public static void rotate(int[][] matrix) {
        transpose( matrix );
        rev(matrix);
    }
    public static void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void rev(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            int left = 0;
            int right = nums.length - 1;
            while(left < right){
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
