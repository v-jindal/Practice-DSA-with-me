public class SearchAll {
    static int[] find(int[] arr,int x, int count, int i){
        if(i==arr.length){
            int[] res=new int[count];
            return res;
        }
        if(arr[i]==x) count++;
        int[] res=find(arr,x,count,i+1);
        if(arr[i]==x) res[count-1]=i;
        return res;
    }
    public static void main(String[] args) {
        int arr[]={12,24,64,31,12,45,12};
        int[] res= find(arr, 12,0,0);
        for(int n:res){
            System.out.println(n);
        }
    }
}
