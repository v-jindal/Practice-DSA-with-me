public class Leetcode345 {
    public static boolean vow(char ch){
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
    public static String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while(left<=right){
            if(!vow(a[left])) left++;
            else if(!vow(a[right])) right--;
            else{
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return new String(a);
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello")); 
    }   
}
