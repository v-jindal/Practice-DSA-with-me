public class ArmStrong {
    public static void main(String[] args) {
        int n = 407;
        int sum=0;
        int count = 0;
        int copy = n;
        while(copy!=0){
            count++;
            copy/=10;
        }
        copy = n;
        while(copy!=0){
            sum+=Math.pow(copy%10,count);
            copy/=10;
        }
        System.out.println(sum==n?"Armstrong":"Not Armstrong");
    }
}
