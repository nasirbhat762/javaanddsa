import java.util.Scanner;

public class OddNumberSum {
    public static int oddSum(int num){
        int sum = 0;

        for(int i = 1 ; i <= num ; i = i + 2){
             sum = sum + i;

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        System.out.println(oddSum(num));
    }
}
