package programs;
//Program to Check both arrays equal or not
public class BothArrayEualOrNot {

	public static void main(String[] args) {
		int arr1[]={1,2,3,4};
		int arr2[]={1,2,3};
		boolean equalOrNot=true;
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					equalOrNot=false;
				}
			}
		}
		else{
			equalOrNot=false;
		}
		if(equalOrNot)
			System.out.println("Both array are equal");
		else
			System.out.println("Both arrays are not equal");
	}

}

