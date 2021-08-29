/**
 * Stable sort
 * time: O(nw) time, where n is the number of keys, and w is the key length.
 * depending on which algorithm we use it can be in-place Algorithm
 * use only when the range of values is reasonable
 */
public class RadixSort{

    public static void radixSort(int[] arr, int radix, int width) {
        for(int i = 0; i < width; i++){
            countSort(arr, i, radix);
        }
    }

    public static void countSort(int[] input, int position, int radix){
        int len = input.length;
        int[] countArray = new int[radix];

        for (int item: input) {
            countArray[getDigit(position, item, radix)]++;
        }

        //adjust count array here
        for(int i = 1; i<radix; i++){
            countArray[i] += countArray[i - 1];
        }

        int[] tempArray = new int[len];
        for (int i = len - 1; i >= 0 ; i--) {
            tempArray[--countArray[getDigit(position, input[i], radix)]] = input[i];            
        }

        for (int i = 0; i < len; i++) {
            input[i] = tempArray[i];
        }
    }

    //returns digit at specified position
    public static int getDigit(int position, int item, int radix){
        return item / (int) Math.pow(10, position) % radix;
    }

    public static void main(String[] args) {
        int[] radixArray = {1234, 4565, 6585, 1267, 2356, 9757, 1124, 3325, 4332};
        radixSort(radixArray, 10, 4);

        for (int item : radixArray) {
            System.out.println(item);
        }
    }
}