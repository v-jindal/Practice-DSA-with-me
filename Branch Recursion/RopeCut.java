public class RopeCut {
    static int cut(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int opt1= cut(n-a,a,b,c);
        int opt2= cut(n-b,a,b,c);
        int opt3= cut(n-c,a,b,c);
        int fin = Math.max(Math.max(opt1,opt2),opt3);
        if(fin==-1) return -1;
        return fin+1;
    }
    public static void main(String[] args) {
        int res=cut(5,2,5,3);
        System.out.println(res);
    }
}
