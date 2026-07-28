public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] aux=new int[digits.length+1];
        aux[0]=1;
        return aux;
    }
    public static void main(String[] args) {
        
    }
}
