import java.util.Scanner;

public class IsAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of an array");

        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("enter numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {

                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("array is  in ascending order");
        } else {
            System.out.println("array is not  in ascending order");
        }
    }
}
