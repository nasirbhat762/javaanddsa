import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        int negativeCount = 0;

        while (true) {
            System.out.println("enter a number and enter 789 to exit");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num == 789) {
                break;
            }

            if (num < 0) {
                negativeCount++;
            }

            else if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("odd number count is: " + oddCount);
        System.out.println("Even number count is: " + evenCount);
        System.out.println("negative number count is: " + negativeCount);
    }
}
