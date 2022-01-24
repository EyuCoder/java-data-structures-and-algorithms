package algorithms.search;

/**
 * Time Complexity: O(log n) Logarithmic time
 * Space Complexity: O(1) constant time
 **/
public class BinarySearch {

    static int recursiveBinarySearch(char[] data, char c) {
        return binarySearch(data, c, 0, data.length);
    }

    private static int binarySearch(char[] data, char c, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (data[mid] == c) {
                return mid;
            } else if (data[mid] < c) {
                return binarySearch(data, c, mid + 1, end);
            } else return binarySearch(data, c, start, mid);
        }
        return -1;
    }

    static int iterativeBinarySearch(char[] data, char c) {
        int left = 0;
        int right = data.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (data[mid] == c) {
                return mid;
            } else if (data[mid] < c) {
                left = mid + 1;
            } else right = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] data = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println(String.valueOf(data));
        int x = iterativeBinarySearch(data, 'e');
        System.out.println("Loop: " + x);
        x = iterativeBinarySearch(data, '6');
        System.out.println("Loop: " + x);

        x = recursiveBinarySearch(data, 'e');
        System.out.println("Recursion: " + x);
        x = recursiveBinarySearch(data, 'z');
        System.out.println("Recursion: " + x);
    }
}