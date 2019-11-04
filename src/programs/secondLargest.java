package programs;
//Find second largest element from array
public class secondLargest {

	public static void main(String[] args) {
		int arr[]={2,5,7,9,6,6};
		int firstLargrst=0,secondLargest=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>firstLargrst){
				secondLargest=firstLargrst;
				firstLargrst=arr[i];
			}
			else if(arr[i]<firstLargrst && arr[i]>secondLargest){
				secondLargest= arr[i];
			}
		}
		System.out.println(secondLargest);
		
	}

}
