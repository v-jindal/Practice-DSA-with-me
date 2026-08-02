import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] -b[0]);
        List<int[]> list = new ArrayList<>();
        for(int[] i: intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1] < i[0]){
                list.add(i);
            }
            else{
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1],i[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for(int[] interval : result){
            System.out.println(Arrays.toString(interval));
        }
    }
}
