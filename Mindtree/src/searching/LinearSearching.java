package searching;
import java.util.*;
public class LinearSearching {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  Scanner m =new Scanner(System.in);
	  System.out.println("enter array size:");
	  int n = sc.nextInt();
	  int[] arr=new int[n];
	  for(int i=0; i<n; i++) {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println("the array:"+Arrays.toString(arr));
		  System.out.println("enter the searched element:");
		  int se = m.nextInt();
		  int find=0;
		  for(int i=0; i<n;i++) {
			  if(arr[i]==se) {
				  find=i;
				  
			  }
		  }
		  if(find>0) 
				  System.out.println("the element is found:"+(find));

			  else 
				  System.out.println("the element is not found:");

			  
			  
		  


	  
	  m.close();
	  sc.close();

	}

}
