package krishna;
import java.util.*;
public class upperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   System.out.println("enter the string:");
   String str = s.nextLine();
   String a="";
   for(int i=0; i<str.length(); i++) {
	   char ch = str.charAt(i);
	   if(i%2==0) {
		   ch=Character.toUpperCase(ch);
	   }else {
		   ch=Character.toLowerCase(ch);
	   }
	   a=a+ch;
	   
   }
   System.out.println(a);
   s.close();
	}

}
