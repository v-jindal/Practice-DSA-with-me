import java.util.Arrays;
public class Leetcode509 {
    public static int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n, dp);
    }
    static int helper(int n, int dp[]){
        if(n==0 || n==1) return n;
        if(dp[n] != -1){
            return dp[n];
        }
        int first = helper(n-1, dp);
        int second = helper(n-2, dp);
        dp[n] = first + second;
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
