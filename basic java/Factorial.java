import java.util.Scanner;

public class Factorial {

    public static int fact(int num){
        int factorial = 1;
        for(int i = num ; i > 0; i--){
            factorial = factorial * i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("the factorial of " + num + " is " +fact(num));
    }
}
