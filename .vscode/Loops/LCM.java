public class LCM {
    public static void main(String[] args) {
        int a= 12, b= 24;
        int p= a*b;
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
        System.out.println(p/a);
    }
}
