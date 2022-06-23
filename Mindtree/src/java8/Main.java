package java8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
  Scanner sc=new Scanner(System.in);
  System.out.println("1.Display Book number-wise\r\n"
                      +"\r\n"+"2.Display Book Title-wise\r\n"+
		              "\r\n"+"3.Display Book Author-wise\r\n"+
                      "\r\n"+"4.Exit");
  System.out.println("enter any case:");
  int num=sc.nextInt();
  switch(num) {
  case 1:
	  System.out.println(new BookService().getBooksbyNumber());
	  break;
  case 2:
	  System.out.println(new BookService().getBooksbyTitle());
	  break;
  case 3:
	  System.out.println(new BookService().getBooksbyAuthor());
	  break;
  case 4:
	  break;
 default:
	 System.out.println("invalid case");
  }
  
	}

}
