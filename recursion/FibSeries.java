public class FibSeries {

    public static void fibSeries(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int term = a + b; // term is equal to sum of previous two terms
        System.out.println(term);
        fibSeries(b, term, n - 1); // a becomes b and b becomes term for the next term

    }

    public static void main(String[] args) {
        int n = 7; // 0 1 1 2 3 5 8
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibSeries(a, b, n - 2); // n-2 passed here because we print the first two terms in main function
    }
}
