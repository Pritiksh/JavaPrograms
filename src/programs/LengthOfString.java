package programs;
// program to find length of a string without using length().

public class LengthOfString {

	public static void main(String[] args) {
		int count = 0;
		String str = "Priti";
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println(count);
		
	}

}
