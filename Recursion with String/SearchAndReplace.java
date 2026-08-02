public class SearchAndReplace {
    public static String replace(String s, char search, char r){
        if(s.equals("")) return "";
        if(s.charAt(0)==search) return r+replace(s.substring(1),search,r);
        else return s.charAt(0)+replace(s.substring(1),search,r);
    } 

    public static void main(String[] args) {
        System.out.println(replace("Hello",'H','Y'));
    }
}
