import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.println(names.length);
        System.out.println("enter names");
        for(int i= 0 ; i < size ; i++){
            names[i] = sc.nextLine();
        }

        System.out.println("the names entered are: ");

        for(int i=0 ; i< names.length ; i++){
            System.out.println(names[i]);
        }

    }
}
