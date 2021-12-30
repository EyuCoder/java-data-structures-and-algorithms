package data_structures.arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 22;
        arr1[1] = 99;
        arr1[2] = 73;
        arr1[3] = 98;
        arr1[4] = 23;

        for (int j : arr1) {
            System.out.print(j + " ");
        }

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"this", "is", "a string", "array"};
        for (String str : arr2) {
            System.out.print(str + " ");
        }

        Arrays.fill(arr2, 0, arr2.length, "repeat me");

        System.out.println(Arrays.toString(arr2));
    }
}