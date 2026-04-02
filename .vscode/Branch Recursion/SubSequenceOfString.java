public class SubSequenceOfString {
    static void subSequence(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        subSequence(s.substring(1), res);
        subSequence(s.substring(1), res+s.charAt(0));
    }
    public static void main(String[] args) {
        subSequence("abc","");
    }
}
