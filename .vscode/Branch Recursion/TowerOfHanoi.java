public class TowerOfHanoi {
    static void toh(int disk, char a, char b, char c){
        if(disk==0) return;
        toh(disk-1,a,c,b);
        System.out.println(disk + "-> " +a + " to " + c);
        toh(disk-1,b,a,c);
    }
    public static void main(String[] args) {
        toh(4, 'A', 'B', 'C');
    }
}
