package arrays;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n = s.nextInt();
		int arr[] = new int[n] ;
		System.out.println("enter the number of elements:");
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
			for(int i=0;i<n;i++) {
			if(arr[i]%2 == 0 ) {
				
				System.out.println(arr[i]);
			}
		}
		}

	

}
