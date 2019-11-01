package programs;

//Replace a character at a specific index in a String in Java method 2
public class ReplaceCharAtSpecificIndex {

	public static void main(String[] args) {
		String str = "Core Kava";
		int index = 5;
		char ch = 'J';
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(index, ch);
		System.out.println("Modified string is :" + sb);

	}

}
