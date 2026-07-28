public class Leetcode4 {
    public static double findMedianSortedArrays(int[] a, int[] b) {
        int c = a.length;
        int d = b.length;
        int[] merge = new int[c+d];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < c && j < d){
            if(a[i] <= b[j]){
                merge[k] = a[i];
                i++;
            }
            else{
                merge[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < c){
            merge[k] = a[i];
            i++;
            k++;
        }
        while(j < d){
            merge[k] = b[j];
            j++;
            k++;
        }
        if((c + d) % 2 == 0){
            return (double)(((merge[(c+d)/ 2 - 1 ]) + (merge[(c+d)/ 2]))) / 2;
        }
        else{
            return merge[(c+d)/ 2];
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2};
        double median = findMedianSortedArrays(a, b);
        System.out.println("Median: " + median);
    }
}
