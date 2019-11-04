package programs;
//Find difference between sums of two diagonals java program method 2 

public class DifferenceOfTwoDiagonal {

	public static void main(String[] args) {
		int d1=0,d2=0,n=3;
		int arr[][]={{11, 2, 4}, {4 , 5, 6}, {10, 8, -12} };
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j){
					d1+=arr[i][j];
				}
				if(i==n-j-1){
				d2+=arr[i][j];	
				}
			}
		}
		System.out.println(Math.abs(d1-d2));

	}

}
