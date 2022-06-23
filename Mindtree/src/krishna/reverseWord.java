package krishna;
import java.util.*;
public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s =new Scanner(System.in);
  System.out.println("enter the string:");
  String str = s.nextLine();
 
  String revWord="";
  for(int i=str.length()-1; i>=0; i--) {
	  revWord=revWord+str.charAt(i);
  }
  System.out.println(revWord);
  s.close();
	}

}
