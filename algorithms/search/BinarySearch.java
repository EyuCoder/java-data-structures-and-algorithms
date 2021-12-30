package algorithms.search;
/**
 * Time Complexity: O(log n) Linear time
 * Space Complexity: O(1) constant time
 **/
public class BinarySearch{
    static int binarySearch(char[] data, char c){
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(data[mid] == c){
                return mid;
            }else if(data[mid] < c){
                left = mid + 1;
            }else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] data = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println(String.valueOf(data));
        int x = binarySearch(data, 'e');
        System.out.println("Found at index: " + x);
    }
}