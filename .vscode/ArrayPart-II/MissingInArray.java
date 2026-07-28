public class MissingInArray {
    static int missingNum(int arr[]) {
        int n = arr.length + 1;
        int x = 0;
        for(int i = 1 ; i <= n ; i++){
            x ^= i;
        }
        for(int i: arr){
            x ^= i;
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        System.out.println("Missing number is: " + missingNum(arr));
    }
}