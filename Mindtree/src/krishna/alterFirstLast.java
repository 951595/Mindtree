package krishna;

public class alterFirstLast {

	public static void main(String[] args) {
		String str= "rainbow ";
		String []arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			char[] ch= arr[i].toCharArray();
			if((ch[0] != 'a' && ch[0] != 'A' && ch[0] != 'e' && ch[0] != 'E' && ch[0] != 'i' && ch[0] != 'I' && ch[0] != 'o' && ch[0] != 'O' && ch[0] != 'u' && ch[0]!= 'U') && (ch[ch.length-1] != 'a'  && ch[ch.length-1] != 'A' && ch[ch.length-1] != 'e' && ch[ch.length-1] != 'E'  && ch[ch.length-1] != 'i' && ch[ch.length-1] != 'I' && ch[ch.length-1]!= 'o' && ch[ch.length-1] != 'O' && ch[ch.length-1] != 'u' && ch[ch.length-1] != 'U') ) {
				char temp = ch[ch.length-1];
				 ch[ch.length-1] = ch[0];
				ch[0] = temp;
			}else {
				ch[ch.length-1] = (char)(ch[ch.length-1]+1);
			}
		
		String s = String.valueOf(ch);
   System.out.println(s+" ");
		}
	}

}
