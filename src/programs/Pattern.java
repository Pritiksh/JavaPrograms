package programs;
//program to print below pattern

/*1
12
123
1234
12345*/

public class Pattern {

	public static void main(String[] args) {
		int x = 5;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
