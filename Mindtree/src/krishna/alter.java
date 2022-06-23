package krishna;

public class alter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="Good morning and welcome to Orchard";
  String a="";
  if(s.length()<=3) {
	  for(int i=0;i<s.length();i++) {
		  char ch = s.charAt(i);
		  if(ch ==' ' ) {
			  System.out.println(a);
			  a="";
		  }
		  a=a+ch;
	  }
	  System.out.println(a);
  }else {
	  for(int i=0;i<s.length();i++) {
		  char ch = s.charAt(i);
		  if(ch==' ') {
			  System.out.println(a);
			  a="";
		  }
		  a=ch+a;
	  }
	  System.out.println(a);
  }
	}

}
