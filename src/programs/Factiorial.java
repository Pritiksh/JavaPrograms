package programs;

//program to find factorial of a number.
public class Factiorial {

	public static void main(String[] args) {
		int fact = 1, n = 4;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
