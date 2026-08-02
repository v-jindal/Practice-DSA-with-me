public class GCD {
    public static void main(String[] args) {
        int a = 24, b = 36;
        int min=Math.min(a,b);
        int i=min/2;
        while(i>=1){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                return;
            }
            i--;
        }
    }
}
