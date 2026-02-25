public class SortedArray {
    static boolean sorted(int[] a, int i){
        if(i==a.length-1) return true;
        if(a[i]>a[i+1]) return false;
        return sorted(a,i+1);
    }
    public static void main(String[] args) {
        int[] a={12,84,85,32,32};
        boolean s=sorted(a,0);
        System.out.println(s? "Sorted" : "Not Sorted");
    }
}
