public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pindx = partition(arr, low, high);
            quickSort(arr, low, pindx - 1);
            quickSort(arr, pindx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 3, 2, 7 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

// time complexity of quicksort is n^2 in worst case and the worst case occurs
// when the pivot is largest or samllest
// element
// For average case the time complexity is nlogn
// Sometimes quicksort is preferred over merge sort because we don't create an
// extra array here so it takes
// less space than merge sort
