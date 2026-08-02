public class RotateNumber {
    public static void main(String[] args){
        int n=14978;
        int rot=-11;
        int copy=n;
        int count=0;
        while(copy!=0){
            count++;
            copy/=10;
        }
        rot%=count;
        if(rot<0)rot+=count;
        System.out.println((n%(int)Math.pow(10,rot))*((int)Math.pow(10,count-rot)) + n/(int)Math.pow(10,rot));
    }
}
