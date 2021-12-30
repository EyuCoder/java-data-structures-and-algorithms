package data_structures.arrays;

public class PalindromePermutation{

	static boolean isPermutationOfPalindrome(String str){
		if (str == null) {
			return false;
		}
		int countOdd = 0;
		int[] counts = new int[26];
		for (char c : str.toCharArray()) {
			// 'a' to 'z'
			if (c >= 'a' && c <= 'z') {
				counts[c - 'a']++;
				if (counts[c - 'a'] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd < 2;
	}

	public static void main(String[] args) {

		String str1 = "Tact Coa";
		String str2 = "wowi";

		System.out.println(isPermutationOfPalindrome("str1"));
		System.out.println(isPermutationOfPalindrome("str2"));
	}
}