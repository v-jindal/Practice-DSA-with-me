public class MazePath{
    static void maze(int i,int j,int r,int c,String s){
        if(i>r || j>c) return;
        if(i==r && j==c){
            System.out.println(s);
            return;
        }
        maze(i+1,j,r,c,s+"V");
        maze(i,j+1,r,c,s+"H");
    }
    public static void main(String[] args) {
        maze(0,0,2,2,"");
    }
}