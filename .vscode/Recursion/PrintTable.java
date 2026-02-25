public class PrintTable {
    public static String tablePrint(int n, int i){
        if(i==11) return "";
        return n+"*"+i+" = "+n*i+ "\n" + tablePrint(n,i+1);  
    }
    static void table(int n, int i){
        if(i==11) return;
        System.out.println(n+"*"+i+" = " + n*i);
        table(n,i+1);
    }
    public static void main(String[] args) {
        table(20,1);
        System.out.println(tablePrint(3,1));
    }
}
