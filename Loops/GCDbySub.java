public class GCDbySub {
    public static void main(String[] args) {
        int a = 95 , b = 54;
        while( a != b){
            if( a>b ) a-=b;
            else b-=a;
        }
        System.out.println(a);
    }
}
