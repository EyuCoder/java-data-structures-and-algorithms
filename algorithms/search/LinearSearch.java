package algorithms.search;

import java.util.Arrays;

/**
 * Time Complexity: O(n) Linear time
 * Space Complexity: O(1) constant time
 **/
public class LinearSearch {
    static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 8, 3, 2, 4, 5, 7, 8, 99, 9, 9, 4, 2, 25, 6, 8, 89,};
        System.out.println(Arrays.toString(arr));
        int x = linearSearch(arr, 444);
        System.out.println("Found at index: " + x);
    }
}