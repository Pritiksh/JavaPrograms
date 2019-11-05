package programs;

// program to check whether a number is even/odd without using / or % operator
 
public class EvenOdd {

	public static void main(String[] args) {
		int x = 4;
		if ((x & 1) == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");

	}

}
