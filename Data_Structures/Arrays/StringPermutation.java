package data_structures.arrays;

/**
 * Time Complexity: O(2n) Linear time
 * Space Complexity: O(1) constant time
 **/
public class StringPermutation{

	static boolean isPermutationOf(String s, String t){
		int[] flag = new int[256]; //assumption : extended ASCII

		if (s.length() > 256 || t.length() > 256) return false;

		for (int i : t.toCharArray()) {
			flag[i]++;
		}

		for (int i : s.toCharArray()) {
			if (flag[i] < 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// hashMap
		System.out.println(isPermutationOf("abc", "acdehrkwb"));
		System.out.println(isPermutationOf("abc", "bcx"));
	}
}