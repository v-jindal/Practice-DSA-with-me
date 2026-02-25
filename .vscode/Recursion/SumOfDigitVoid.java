public class SumOfDigitVoid {
    public static void sum(int n, int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        s+=n%10;
        sum(n/10,s);
    }
    public static void main(String[] args) {
        sum(12345,0);
    }
}
