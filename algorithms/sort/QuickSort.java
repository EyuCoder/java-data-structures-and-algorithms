package algorithms.sort;
/*
 * UnStable sort
 * time: O(nlogn) loglinear complexity.
 * In the worst case, it makes O(n2) comparisons, though this behavior is rare.
 * in-place Algorithm
 */

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {

        if (start>=0&&end>=0) {
            if (start< end) {
                int pivot = partition(arr, start, end);

                //Recursive function call
                quickSort(arr, start, pivot - 1);
                quickSort(arr, pivot + 1, end);          
            }
        }
    }

    public static int partition(int[] arr, int start, int end) {
        //lomuto partition scheme
        int pivot = end;
        int i = start - 1;

        for(int j = start; j <= end; j++){
            if(arr[j] <= arr[pivot]){
                swap(arr, ++i, j);
            }
        }

        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {23, 43, 43, 21, 2, 4, 77, 9, 0, 788, 7};
        quickSort(arr, 0, arr.length - 1);

        for (int item : arr) {
            System.out.println(item);
        }
    }
}