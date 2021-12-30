package data_structures.hashtables;/*
 * Time Complexity: O(n) Linear time
 * Space Complexity: O(1) constant time
 **/
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            //System.out.println(val + " : " + str.charAt(i) + " : " + charSet[val]);
            if (charSet[val]) { // Already found this char in string
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

    static boolean isUniqueChars2(String str) {
        if (str.length() > 128) return false;
        Map map = new HashMap<Integer, Boolean>(128);

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            //System.out.println(val + " : " + str.charAt(i) + " : " + charSet[val]);
            if (map.containsKey(val)) { // Already found this char in string
                return false;
            }
            map.put(val, true);
        }
        return true;
    }

    public static void main(String[] args) {
        // using string boolean
        System.out.println(isUniqueChars("Joel"));
        System.out.println(isUniqueChars("jjjj"));

        // using hashMap
        System.out.println(isUniqueChars2("Joel"));
        System.out.println(isUniqueChars2("jjjj"));
    }
}