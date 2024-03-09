public class InsertionSort {
    public static void main(String[] args) {
        // insertion sort 
        // time complexity is O(n^2)
        int array [] = { 7, 8, 3, 1, 2};

        for(int i = 0 ; i< array.length ; i++){
            int sorted = array[i];
            int j = i - 1;
            while(j >= 0 && sorted < array[j]){
                array[j+1] = array[j];
                j--;
            }

            // placement
            array[j+1] = sorted;
        }

        for(int i = 0 ; i< array.length ; i++){
            System.out.print(array[i]);
        }
    }
}
