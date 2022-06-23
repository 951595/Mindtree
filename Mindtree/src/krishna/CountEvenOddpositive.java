package krishna;
import java.util.*;
public class CountEvenOddpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the nomber of elements in array:");
      int n = s.nextInt();
      int[] a = new int[n];
      int evenCount=0, oddCount=0, positiveCount=0;
      System.out.println("please enter"+n+"elements of an array:");
      for(int i =0;i<n;i++) {
    	  a[i] = s.nextInt();
      }
      for(int i=0;i<n;i++) {
    	  if((a[i]%2)==0) {
    		  evenCount++;
    		  
    	  }else {
    		  oddCount++;
    	  }
    	  
      }
      for(int i=0;i<n;i++) {
    	  if(a[i]>0) {
    		  positiveCount++;
    	  }
      }
      System.out.println("total number of even numbers:"+evenCount);
      System.out.println("total number of odd numbers:"+oddCount);
      System.out.println("total number of positive numbers:"+positiveCount);
      s.close();
	}

}
