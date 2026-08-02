import java.util.ArrayList;

public class SnakeMatrix {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix.length - 1;
        int bottom = 0;
        while(bottom <= right){
            left = 0;
            while(left <= right){
                list.add(matrix[bottom][left++]);
            }
            bottom++;
            left = right;
            if(bottom <= right){
                while(left >= 0){
                    list.add(matrix[bottom][left--]);
                }
            }
            bottom++;
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(snakePattern(matrix));
    }
}
