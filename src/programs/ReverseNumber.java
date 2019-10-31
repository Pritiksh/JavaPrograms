package programs;
//Reverse a Number using a while loop in Java
public class ReverseNumber {

	public static void main(String[] args) {
		int n=123456,sum=0,r;
		while(n>0){
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println("Reverse no: "+sum);
	}
}
