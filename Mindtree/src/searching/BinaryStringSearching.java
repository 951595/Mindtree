package searching;
import java.util.*;
public class BinaryStringSearching {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Scanner m = new Scanner(System.in);
	System.out.println("enter the array size");
	int n=sc.nextInt();
	String[] arr=new String[n];
	for(int i=0; i<n; i++) {
		arr[i]=sc.next();
	}
	System.out.println("the array is:"+Arrays.toString(arr));
	System.out.println("enter the searching elements:");
	String se=m.nextLine();
	int found=0;
	int start=0;
	int end=n-1;
	while(start<=end) {
	int	mid=(start+end)/2;
       if(se.compareTo(arr[mid])>0)
	       end=mid-1;
       else if(se.compareTo(arr[mid])>0)
    	   start=mid+1;
       else
    	   found=mid;
       break;
	}if(found>0)
		System.out.println("the element of index is found:"+found);
	else
		System.out.println("th element not found:");
	  
	m.close();
	sc.close();
	
	
	}

}
