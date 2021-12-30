package data_structures.arrays;

public class URLify{

	static char[] urlify(char[] str, int len){
		if (str == null) return new char[]{};
		
		int spaceCount = 0, index = 0;

		for (int i = 0; i < len; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = len + spaceCount * 2 - 1;
		// second loop, replace spaces from the end
		for (int i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index -= 3;
			} else {
				str[index] = str[i];
				index--;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "Mr John Doe J         ";
		String url = String.valueOf(urlify(str.toCharArray(), 13));
		System.out.println(url);
	}
}