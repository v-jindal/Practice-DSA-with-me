public class Factorial {
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void fact(int n, int f){
        if(n==0 || n==1){
            System.out.println(f);
            return;
        }
        f*=n;
        fact(n-1,f);
    }
    public static void main(String[] args) {
        fact(5,1);
        System.out.println(fact(6));
    }
}
