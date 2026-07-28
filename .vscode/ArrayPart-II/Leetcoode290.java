import java.util.HashMap;
import java.util.Map;

public class Leetcoode290 {
    public static boolean wordPattern(String pattern, String st) {
        String[] s = st.split(" ");
        if(s.length != pattern.length()) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length ; i++){
            char c = pattern.charAt(i);
            String word = s[i];
            if(!map1.containsKey(c) && !map2.containsKey(word)){
                map1.put(c, word);
                map2.put(word, c);
            }
            else if(!map2.containsValue(c)) return false;
            else if(!map1.containsValue(word)) return false;
            else{
                if(!map1.get(c).equals(word)) return false;
                else if(!map2.get(word).equals(c)) return false;
                else continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); 
        System.out.println(wordPattern("abba", "dog cat cat fish")); 
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); 
        System.out.println(wordPattern("abba", "dog dog dog dog")); 
    }
}