package programs;
//program to make the string “Name is Smith” as “Smith is Name”.
public class ModifyString {

	public static void main(String[] args) {
	String s="Name is PK"	;
	String temp;
	String[] arr=s.split(" ");
	temp = arr[0];
	arr[0] = arr[2];
	arr[2] = temp;
	for(String s1:arr){
		System.out.println(s1+" ");
	}
	}

}
