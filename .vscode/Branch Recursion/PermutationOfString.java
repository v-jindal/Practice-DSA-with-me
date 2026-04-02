public class PermutationOfString {
    static void per(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String ss=s.substring(0,i)+s.substring(i+1);
            per(ss,res+c);
        }
    }
    public static void main(String[] args) {
        per("cars","");
    }
}
