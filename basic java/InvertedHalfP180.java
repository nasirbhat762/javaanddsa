public class InvertedHalfP180 {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for moving to next line
            System.out.println();
        }
    }
}
