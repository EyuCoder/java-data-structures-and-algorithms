/**
 * UnStable sort
 * time: O(n) Linear Time
 * Not in-place Algorithm
 * use only when the range of values is reasonable
 */
public class CountingSort{

    public static void countingSort(int[] intArray, int min, int max){
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < intArray.length; i++) {
            countArray[intArray[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++) {
            while(countArray[i - min] > 0) {
                intArray[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 1, 4, 6, 2, 6, 3, 7, 7, 10, 34, 6};
        countingSort(intArray, 1, 34);
        
        for (int item : intArray) {
            System.out.println(item);
        }
    }
}