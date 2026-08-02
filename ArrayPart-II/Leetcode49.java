import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode49 {
    static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            return true;
        }
        return false;
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for(String s: strs){
            boolean found = false;
            for(List<String> l: res){
                if(isAnagram(s, l.get(0))){
                    l.add(s);
                    found = true;
                }
            }
            if(!found){
                List<String> l = new ArrayList<>();
                l.add(s);
                res.add(l); 
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}