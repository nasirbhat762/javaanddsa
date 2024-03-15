//  time complexity of merge sort is nlogn 
class MergeSort {

    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2; // Calculate the middle index

        divide(arr, si, mid); // Recursively divide the left half
        divide(arr, mid + 1, ei); // Recursively divide the right half

        conquer(arr, si, mid, ei); // Merge the divided segments
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Create an array to store the merged result
        int idx1 = si;
        int idx2 = mid + 1;
        int mergedidx = 0;

        // Merge the two segments
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merged[mergedidx] = arr[idx1];
                mergedidx++;
                idx1++;
            } else {
                merged[mergedidx] = arr[idx2];
                mergedidx++;
                idx2++;
            }
        }

        // Copy remaining elements from the left segment
        while (idx1 <= mid) {
            merged[mergedidx] = arr[idx1];
            mergedidx++;
            idx1++;
        }

        // Copy remaining elements from the right segment
        while (idx2 <= ei) {
            merged[mergedidx] = arr[idx2];
            mergedidx++;
            idx2++;
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1); // Call divide to start the merge sort process

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
