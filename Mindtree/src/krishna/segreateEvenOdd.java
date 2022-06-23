package krishna;
import java.util.*;
public class segreateEvenOdd {
	public void krishna(int arr[] ) {
		int countEven=0;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]%2==0) {
				countEven++;
			}
		}
		int i=0;
		int j=i+1;
		while(i !=countEven) {
			if(arr[i]%2 == 0) {
				i++;
				j = i+1;
			}else if(arr[i]%2 == 1 && j<len) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println("After reconstructing:");
		for(int k=0;k<len;k++) {
			System.out.println(arr[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {2,7,21,45,4,10,17,30,41,20};
    System.out.println("initial array:");
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
    System.out.println("");
    segreateEvenOdd a = new segreateEvenOdd();
    a.krishna(arr);
	}

}
