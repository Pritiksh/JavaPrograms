package programs;

/*
 * A palindromic number is a number that remains the same when its digits are reversed. Like 161
 */
public class PalindromeNo {

	public static void main(String[] args) {
		int r, sum = 0, temp;
		int n = 452;
		temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (sum * 10) + r;
		}
		if (temp == sum) {
			System.out.println("Palindrome number ");
		} else {
			System.out.println("Not a Palindrome number ");
		}

	}

}
