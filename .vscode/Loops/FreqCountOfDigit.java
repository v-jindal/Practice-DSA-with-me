import java.util.HashMap;

public class FreqCountOfDigit {
    public static void main(String[] args){
        int n = 24112003;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0){
            map.put(n%10,map.getOrDefault(n%10,0)+1);
            n/=10;
        }
        System.out.println(map);
    }
}
