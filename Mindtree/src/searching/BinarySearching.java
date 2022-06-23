package searching;
import java.util.*;
public class BinarySearching {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Scanner m =new Scanner(System.in);
		System.out.println("enter the array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the array:"+Arrays.toString(arr));
		System.out.println("enter the searching element:");
		int se=m.nextInt();
		int find=0;
		int start=0;
		int end=n-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(se<arr[mid]) 
				end=mid-1;

			else if(se>arr[mid])
				start=mid+1;
			else
				find=mid;
			break;
			   
				
		}
		if(find>0) 
			  System.out.println("the element is found:"+(find));

		  else 
			  System.out.println("the element is not found:");


		
		sc.close();

	}

}
