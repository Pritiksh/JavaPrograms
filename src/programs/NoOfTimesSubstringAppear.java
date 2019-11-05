package programs;

//program to check number of times substring appeared in a string.
public class NoOfTimesSubstringAppear {

	public static void main(String[] args) {
		String s = "Java is for Java Professional to develop Java Application";
		String[] arr = s.split("Java");
		System.out.println(arr.length - 1);

	}

}
