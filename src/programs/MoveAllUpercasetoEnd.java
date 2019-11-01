package programs;
//Java program move all uppercase alphabets to the end of string method2

public class MoveAllUpercasetoEnd {

	public static void main(String[] args) {
		String str = "Hello India";

		String low = "";
		String upr = "";
		// traverse string first char to last char
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			// check char is in uppercase or lower case
			if (ch >= 'A' && ch <= 'Z') {
				upr += ch;
			} else {
				low += ch;
			}
		}
		System.out.println(low + upr);

	}

}
