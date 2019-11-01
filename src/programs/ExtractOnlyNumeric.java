package programs;

//Extract only numeric from string
public class ExtractOnlyNumeric {

	public static void main(String[] args) {
		String str = "sdfvsdf68fsdfsf8999fsdf09";
		String numOnly = str.replaceAll("[^0-9]", "");
		System.out.println(numOnly);

	}

}
