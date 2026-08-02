import java.util.ArrayList;

public class FirstAndLastOccurenes {
    static int first(int arr[], int x){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int n = -1;
        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid] == x){
                n = mid;
                right = mid-1;
            }
            else if(arr[mid] > x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return n;
    }    
    static int last(int arr[], int x){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int n = -1;
        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid] == x){
                n = mid;
                left = mid + 1;
            }
            else if(arr[mid] > x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return n;
    }
    static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first(arr, x));
        res.add(last(arr, x));
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        ArrayList<Integer> result = find(arr, target);
        System.out.println(result);
    }
}
