package krishna;

public class reverseLength {
	public void mindtree(String s) {
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String Word=words[i];
			String revWord="";
		     if(Word.length()<=4) {

			for(int j=Word.length()-1;j>=0;j--) {
			
				revWord=revWord+Word.charAt(j);
				
			}
		     }    
		if(Word.length()<=4) {	
		
		System.out.println(revWord);
		}else {
			System.out.println(Word);
		}
		
		}
	}
	
	public static void main(String[] args) {
		reverseLength ob = new reverseLength();
		ob.mindtree("i am new to java programming");
	}

}
