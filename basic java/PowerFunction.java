import java.util.Scanner;

public class PowerFunction {
    public static int calculatePower(int num, int pow){
        int res = 1;
        for(int i = 1 ; i <= pow; i++){
          res = num * res ;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("enter power");
        int pow = sc.nextInt();

        System.out.println(calculatePower(num, pow));
    }
}
