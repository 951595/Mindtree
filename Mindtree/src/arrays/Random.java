package arrays;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int) Math.round((Math.random()*100));
		
		}
   System.out.println(Arrays.toString(arr));
		
	}

}
