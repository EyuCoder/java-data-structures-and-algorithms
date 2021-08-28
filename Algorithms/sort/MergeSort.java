/**
 * Stable sort
 * time: O(nlogn) loglinear complexity
 * not an in-place Algorithm
 */
public class MergeSort {

    public static void merge(int[] leftArray, int[] rightArray, int[] arr, int leftSize, int rightSize) {

        int tempIndex = 0, i = 0, j = 0;
        while (i < leftSize && j < rightSize) {

            if (leftArray[i] < rightArray[j]) {
                arr[tempIndex++] = leftArray[i++];
            } else {
                arr[tempIndex++] = rightArray[j++];
            }
        }
        while (i < leftSize) {
            arr[tempIndex++] = leftArray[i++];
        }
        while (j < rightSize) {
            arr[tempIndex++] = rightArray[j++];
        }
    }

    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[len - mid];

        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                leftArray[i] = arr[i];
            } else {
                rightArray[k] = arr[i];
                k = k + 1;
            }
        }

        mergeSort(leftArray, mid);
        mergeSort(rightArray, len - mid);
        merge(leftArray, rightArray, arr, mid, len - mid);
    }

    public static void main(String[] args) {
        int[] arr = {23, 43, 43, 21, 2, 4, 77, 9, 0, 788, 7};
        mergeSort(arr, arr.length);

        for (int item : arr) {
            System.out.println(item);
        }
    }
}