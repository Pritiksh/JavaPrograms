package programs;

// White Spaces Removal Java Program  

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "My name is PK";
		String removeSpace = str.replaceAll("\\s", "");
		System.out.println(removeSpace);
	}

}
