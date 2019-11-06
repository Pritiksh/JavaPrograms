package programs;

//program to find number of vowels in a string
public class FindVowelsInString {

	public static void main(String[] args) {
		String s = "India is a big country";
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}

}
