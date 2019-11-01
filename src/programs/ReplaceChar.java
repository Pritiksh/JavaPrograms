package programs;
//Replace a character at a specific index in a String in Java
public class ReplaceChar {

	public static void main(String[] args) {
	String str="Core Kava";
	int index = 5;
	char ch='J';
	str = str.substring(0,index)+ch+str.substring(index+1);
	System.out.println("Modified String is:"+str);
	}

}
