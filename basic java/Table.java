import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1 ; i< 11 ; i++){
            System.out.println("2 * " + i + " = " + num * i);
        }
    }
}
