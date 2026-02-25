public class PowerAnumber {
    static int pow(int n,int t){
        if(t==0) return 1;
        return n*pow(n,t-1);
    }
    static void pow(int n,int t,int res){
        if(t==0 ){
            System.out.println(res);
            return;
        }
        res*=n;
        pow(n,t-1,res); 
    }
    public static void main(String[] args) {
        pow(2,4,1);
        System.out.println(pow(2,12));
    }
}