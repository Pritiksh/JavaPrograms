package programs;

//Java program move all Uppercase alphabets to the end of string method1
public class MoveAllUpercasetoEndOfString {

	public static void main(String[] args) {
		String str = "Hello India";
		String move = str.replaceAll("[A-Z]+", "") + str.replaceAll("[^A-Z]+", "");
		System.out.println(move);
	}

}
