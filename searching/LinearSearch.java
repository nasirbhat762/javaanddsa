import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 4, 5, 6, 73, 23 };
        System.out.println("enter number to be searched");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean elementFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("element found at index " + i);
                elementFound = true;
            } 
        }

        if(!elementFound){
            System.out.println("element not found");
        }
    }
}