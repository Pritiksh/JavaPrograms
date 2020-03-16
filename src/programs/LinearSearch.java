package programs;

//Linear search If x 
//is present then return its location, otherwise 
//return -1 
//The time complexity  is O(n)
public class LinearSearch {
	static int BinarySearch(int arr[],int x){
		int l=0,r=arr.length-1,m;
		while(l<=r){
			m=l+(r-l)/2;
			if(arr[m]==x){
				return m;
			}
			if(arr[m]<x){
				l=m+1;
			}
			else{
				r=m-1;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int arr[]={1,3,5,7,9,10};
	int n=arr.length;
	int x=9;
	int res=BinarySearch(arr,x);
	if(res==-1){
		System.out.println("Element not present");
	}
	else{
		System.out.println("Element found at index"+res);
	}
	
}	
	
}