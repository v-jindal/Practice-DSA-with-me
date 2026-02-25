public class CountEveOdd {
    static int[] count(int range){
        if(range==0){
            int[] res=new int[2];
            return res;
        }
        int[] res= count(range-1);
        if(range%2==0) res[0]++;
        else res[1]++;
        return res;
    }
    public static void main(String[] args) {
        int a[]=count(5);
        System.out.println("Even Count= "+a[0]);
        System.out.println("Odd Count= "+a[1]);
    }
}
