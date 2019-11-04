package programs;
//Find difference between sums of two diagonals java program method 2 
public class DifferenceOfTwoDiagonals {

	public static void main(String[] args) {
		int d1=0,d2=0,n=3;
		int arr[][]={{11, 2, 4}, {4 , 5, 6}, {10, 8, -12} };
		for(int i=0;i<arr.length;i++){
			
				if(arr[i]==arr[i]){
					d1+=arr[i][i];
					d2+=arr[i][n-i-1];
				}
				
		}
		System.out.println(Math.abs(d1-d2));
	}

}
