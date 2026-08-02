public class Leetcode1544 {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32){
                sb.deleteCharAt(sb.length() - 1);
            } 
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode")); 
        System.out.println(makeGood("abBAcC")); 
        System.out.println(makeGood("s")); 
    }
}
