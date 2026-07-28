public class Leetcode392 {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return s.length() == i;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("Is subsequence: " + isSubsequence(s, t));
    }
}
