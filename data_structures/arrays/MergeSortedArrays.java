package data_structures.arrays;//merge sorted Array

class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 6, 7, 11, 22};
        int[] arr2 = {3, 5, 9, 12, 34};

        int length = arr1.length + arr2.length;

        int[] mergedArray = new int[length];

        int item1 = arr1[0];
        int item2 = arr2[0];

        int i = 0, j = 0;

        while (length >= 0) {

            if (item1 < item2) {
                mergedArray[i] = item1;
                i++;
                item1 = arr1[i];
            } else {
                mergedArray[j] = item2;
                j++;
                item2 = arr2[j];
            }
            length--;
        }

        System.out.println(mergedArray);
    }
}