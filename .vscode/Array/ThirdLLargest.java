public class ThirdLLargest {
    static int third(int[] a){
        if(a.length<3) return -1;
        int first = -1;
        int second = -1;
        int third = -1;
        for(int i: a){
            if(i>=first){
                third = second;
                second = first;
                first = i;
            }
            else if(i>=second){
                third = second;
                second = i;
            }
            else if(i>=third){
                third = i;
            }
        }
        return third;
    }
    public static void main(String[] args) {
        int a[] = {4,78,78,1,24,65};
        System.out.println(third(a));
    }
}
