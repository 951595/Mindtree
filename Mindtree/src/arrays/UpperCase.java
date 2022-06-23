package arrays;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		   System.out.println("enter the string:");
		   String str = s.nextLine();
		   String a="";
		  
		   for(int i=0; i<str.length(); i++) {
			   char ch = str.charAt(i);
			   if(str.length()>4) {
			   if(i%2==0) {
				   ch=Character.toUpperCase(ch);
			   }
			   }
			   else {
				   ch=Character.toLowerCase(ch);
			   }
			   a=a+ch;
			   
		   }
		   System.out.println(a);
		   s.close();


	}

}
