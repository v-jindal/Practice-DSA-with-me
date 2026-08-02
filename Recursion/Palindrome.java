public class Palindrome {
    static void pal(int n,int rev, int copy){
        if(n==0){
            if(rev==copy) System.out.println("Palindrome");
            else System.out.println("Not a palindrome");
            return;
        }
        rev=rev*10 + n%10;
        pal(n/10,rev,copy);
    }
    public static void main(String[] args) {
        int n=1245652121;
        int copy=n;
        pal(n,0,copy);
    }
}
