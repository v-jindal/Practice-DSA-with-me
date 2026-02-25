//DIVISION METHOD
public class GCDbyEuclidean {
    public static void main(String[] args) {
        int a = 15 , b = 95 ;
        while( a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println("GCD is "+b);
    }
}
