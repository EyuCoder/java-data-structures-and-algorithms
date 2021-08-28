/**
 * Stable sort
 * time: O(n^2) Quadratic Time
 * in-place Algorithm
 */
public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int newElement = arr[i];

            int j;
            for (j = i; j > 0 && arr[j - 1] > newElement; j--) {

                arr[j] = arr[j - 1];

                // for(int item: arr){
                // 	System.out.print(item + ", ");
                // }
                // System.out.println();
            }
            arr[j] = newElement;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {23, 435, 5, 6, 88, 99, -32, 4, -665};
        int[] sortedArray = insertionSort(arr);

        for (int item : sortedArray) {
            System.out.println(item);
        }
    }
}