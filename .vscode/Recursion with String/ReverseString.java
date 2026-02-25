public class ReverseString {
    static String rev(String s){
        if(s.length()==1){
            return s;
        }
        String res=rev(s.substring(1));
        return res+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(rev("Vanshika Jindal"));
    }
}
