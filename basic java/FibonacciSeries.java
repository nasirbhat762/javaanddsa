import java.util.Scanner;

public class FibonacciSeries {
    public static void printFib(int num){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(num > 2){
            System.out.print(a + " ");
            System.out.print(b + " ");
            for(int i = 1 ; i < num -1; i++){
                sum = a+b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        } else if(num==2){
            System.out.print(a + " ");
            System.out.print(b + " ");

        }
        else if(num ==1){
            System.out.print(a + " ");
        }
        else{
            System.out.println("please enter valid number");
        }
        
    }
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       printFib(num);
  }
    
}