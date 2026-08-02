public class EvenOddPossSum {
    public static void main(String[] args) {
        int n = 7846;
        int i = 1;
        int odd = 0, even = 0;
        while (n != 0) {
            if (i % 2 == 0)
                even += n % 10;
            else
                odd += n % 10;
            n /= 10;
            i++;
        }
        System.out.println("Sum of even positions are-> " + even);
        System.out.println("Sum of odd positions are-> " + odd);
    }
}
