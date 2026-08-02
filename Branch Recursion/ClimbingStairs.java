public class ClimbingStairs {
    static int ways(int n){
        if(n<=1) return 1;
        int count1=ways(n-1);
        int count2=ways(n-2);
        return count1+count2;
    }
    public static void main(String[] args) {
        int res=ways(5);
        System.out.println(res);
    }
}
