public class CountEvenOdd {
    public static void count(int range, int even, int odd) {
        if (range == 0) {
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);
            return;
        }
        if (range % 2 == 0)
            even++;
        else
            odd++;
        count(range-1, even, odd);
    }
    public static void main(String[] args) {
        count(25, 0, 0);
    }
}
