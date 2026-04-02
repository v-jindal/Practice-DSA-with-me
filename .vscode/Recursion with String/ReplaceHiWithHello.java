public class ReplaceHiWithHello {
    static String replace(String s){
        if(s.length()==1) return "";
        if(s.charAt(0)=='h' && s.charAt(1)=='i') return "Hello"+replace(s.substring(2));
        else return s.substring(0,2)+replace(s.substring(2));
    }
    public static void main(String[] args) {
        System.out.println(replace("hi Hello hi, hi hi how are you, hi "));
    }
}
