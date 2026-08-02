public class Leetcode844 {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '#') sb.append(c);
            else{
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        StringBuilder tb = new StringBuilder();
        for(char c : t.toCharArray()){
            if(c != '#') tb.append(c);
            else{
                if(tb.length() > 0){
                    tb.deleteCharAt(tb.length() - 1);
                }
            }
        }
        return sb.toString().equals(tb.toString());
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c")); 
        System.out.println(backspaceCompare("ab##", "c#d#")); 
        System.out.println(backspaceCompare("a##c", "#a#c")); 
        System.out.println(backspaceCompare("a#c", "b")); 
    }
}
