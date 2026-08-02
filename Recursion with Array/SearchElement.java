public class SearchElement {
    public static int search(int a[], int x, int i){
        if(a.length==i) return -1;
        if(a[i] == x) return i;
        return search(a,x,i+1);
    }
    public static void main(String[] args) {
        int[] a={12,45,78,42,31,28,02,05,24};
        System.out.println(search(a,5,0));
    }
}
