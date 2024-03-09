public class SelectionSort {

    public static void main(String[] args) {
        int numbers[] = { 7, 8, 3, 1, 2 };

        // Selection sort
        // time complexity is O(n^2)
        for (int i = 0; i < numbers.length; i++) {
            int smallest = i;

            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[smallest] > numbers[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = temp;
        }

        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
    }
}
