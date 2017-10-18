import java.util.*;
// it will check if there present two element in array whose sum are equal to particular value...
//  using hashset it complexity becomes o(n).....
public class Sum {
	public static void findSum(int[] arr,int sum){
		HashSet<Integer> hs = new HashSet<Integer>();
	    for(int a:arr){
	    	hs.add(a);
	    }
	    for(Integer a:hs){
	    	int m =sum-a;
	    	if(hs.contains(m)){
	    	  System.out.println("["+a+","+(m)+"]");
	    	  //return;
	    	  }
	    	
	    }
	  //  System.out.println("no");
	}
public static void main(String[] args){
	int[] arr = {2,5,1,4,6,4,3};
	int sum =5;
	findSum(arr,sum);
}
}
