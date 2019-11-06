package programs;

//program to swap 2 numbers without using temp variable
public class SwapingTwoNo {

	public static void main(String[] args) {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

	}

}
