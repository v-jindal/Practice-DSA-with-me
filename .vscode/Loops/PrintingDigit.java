public class PrintingDigit {
    public static void main(String[] args){
        int n=54975;
        int copy=n;
        int count=0;
        while(copy!=0){
            count++;
            copy/=10;
        }
        copy=n;
        int div=(int)Math.pow(10,count-1);
        while(div!=0){
            System.out.println(copy/div);
            copy%=div;
            div/=10;
        }
    }
}
