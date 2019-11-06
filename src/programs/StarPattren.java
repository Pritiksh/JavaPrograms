package programs;

//program to print below star pattern:
/*
*
***
*****
*******
*********
*/
public class StarPattren {

	public static void main(String[] args) {
		int x = 5, p = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i + p; j++) {
				System.out.print("*");
			}
			System.out.println("");
			p = p + 1;
		}

	}

}
