public class BoardProblem {
    static void dice(int n,int end, String s){
        if(n==end){
            System.out.println(s);
            return;
        }
        if(n>end) return;
        dice(n+1,end,s+"1");
        dice(n+2,end,s+"2");
        dice(n+3,end,s+"3");
        dice(n+4,end,s+"4");
        dice(n+5,end,s+"5");
        dice(n+6,end,s+"6");
    }
    public static void main(String[] args) {
        dice(0,10,"");
    }
}
