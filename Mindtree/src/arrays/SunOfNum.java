package arrays;
import java.util.*;
public class SunOfNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int sum=0;
		System.out.println("print the sum of elemnets:");
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
		
		}
		System.out.println(sum);
		s.close();

	}

}
