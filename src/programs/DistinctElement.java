package programs;
//program to find distinct elements in an array- method 1
public class DistinctElement {

	public static void main(String[] args) {
		int arr[]={2,1,3,4,3,2,1,6,8,9,34,2,34};
		for(int i=0;i<arr.length;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				System.out.print(arr[i]+" ");
			}
		}

	}

}
