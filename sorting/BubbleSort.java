class BubbleSort {

    public static void display(int arr[]) {
        // for displaying the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {
        // BubbleSort
        // time complexity is O(n^2)
        int numbers[] = { 7, 8, 3, 1, 2 };
        // the outer loop runs from 0th to array length - 1 element
        for (int i = 0; i < numbers.length - 1; i++) {
            // inner loop runs from 1 position less each time
            for (int j = 0; j < (numbers.length - i - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        display(numbers);

    }
}