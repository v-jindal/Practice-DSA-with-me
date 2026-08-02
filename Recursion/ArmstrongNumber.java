public class ArmstrongNumber {
    static int countDigit(int n){
        if(n==0) return 0;
        return countDigit(n/10)+1;
    }
    static void armstrong(int n,int sum, int copy, int count){
        if(n==0){
            System.out.println(copy==sum ? "Armstrong Number" : "Not an Armstrong number");
            return;
        }
        sum+=Math.pow(n%10,count);
        armstrong(n/10,sum,copy,count);
    }
    public static void main(String[] args) {
        int n = 153;
        int count = countDigit(n);
        int copy = n;
        armstrong(n,0,copy,count);
    }
}
