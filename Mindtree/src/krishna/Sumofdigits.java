package krishna;
import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		
      Scanner s = new Scanner(System.in);
      System.out.println("enter the number:");
      int n = s.nextInt();
      int sum=0 , i=0;
      
      while(i<n){
    	  int n1=n%10;
    	  sum=sum+n1;
    	  n=n/10;
    	 
      }
      System.out.println("sumofdigits:"+sum);
      
      s.close();
	}
 
}
