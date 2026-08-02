// Strong number also known as peterson number
public class PetersonNumber {
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args){
        int n=145;
        int copy = n;
        int sum=0;
        while(copy!=0){
            sum+=fact(copy%10);
            copy/=10;
        }
        System.out.println(sum==n?"Peterson":"Not Peterson");
    }
}
