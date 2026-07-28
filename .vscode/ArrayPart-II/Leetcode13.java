import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int prev = map.get(s.charAt(s.length() - 1));
        int sum = prev;
        for(int i = s.length() - 2; i >= 0; i--){
            char c = s.charAt(i);
            int cur = map.get(c);
            if(cur >= prev){
                sum += cur;
            }
            else{
                sum -= cur;
            }
            prev = cur;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println("The integer value of the Roman numeral " + s + " is: " + result);
    }
}
