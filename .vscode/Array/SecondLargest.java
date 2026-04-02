import java.util.*;
public class SecondLargest {
    static int second(int[] a){
        int first = -1;
        int second = -1;
        for(int i : a){
            if(i>first){
                second = first;
                first = i;
            }
            else if(i>second && i!=first){
                second = i;
            }
        }
        return second;
    } 
    public static void main(String[] args) {
        int a[] = {4,78,78,1,24,65};
        System.out.println(second(a));
    } 
}
