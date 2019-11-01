package programs;

//Reverse a number using a for loop in Java
public class ReverseNum {

	public static void main(String[] args) {
		int n = 12345, r, sum = 0;
		for (; n != 0; n /= 10) {
			r = n % 10;
			sum = (sum * 10) + r;
		}
		System.out.println(sum);
	}

}
