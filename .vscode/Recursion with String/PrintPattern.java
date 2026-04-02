public class PrintPattern {
    public static void s(int n){
        if(n==0) return;
        System.out.print("*");
        s(n-1);
    }
    public static void star(int line){
        if(line == 0) return;
        star(line-1);
        s(line);
        System.out.println();
    }
    public static void main(String[] args) {
        star(4);
    }
}
