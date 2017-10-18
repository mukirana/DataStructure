// Binary search program  it also check if more than one same element are present in the array
// then it will return least index of element which is being searched........
public class BinarySearch {
	public static int binary(int[] arr,int find){
		int f = 0;
		int latest =-1;
		int last = arr.length-1;
		
		while(f<=last){
			int mid = (f+last)/2;
			if(find==arr[mid]){
					latest= mid;
				}
			if(arr[mid]<find)
				f=mid+1;
			else if(arr[mid]>=find) 
					  last = mid-1;
		}
		return latest;
	}
public static void main(String[] args){
	int[] arr = {1,1,1,1,2,2,3};
	
	System.out.println(binary(arr,2));
}
}
