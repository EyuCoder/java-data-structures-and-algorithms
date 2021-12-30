package data_structures.arrays;

public class OneAway{

	static boolean oneAway(String str1, String str2){
		int[] table = new int[128];
		int count = 0;

		for (int c: str1.toCharArray()) {
			table[c]++;
			System.out.println(c);
		}

		for (int c: str2.toCharArray()) {
			if(table[c] < 1) count++;
			System.out.println(count);
		}

		return count < 1;
	}

	public static void main(String[] args) {
		System.out.println(oneAway("pale", "elp"));
		// System.out.println(oneAway("pale", "ple"));
	}
}