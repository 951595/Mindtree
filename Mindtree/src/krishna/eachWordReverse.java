package krishna;

public class eachWordReverse {
	public void mindtree(String s) {
		String[] words=s.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			rev=rev+revWord+" ";
		}
		System.out.println(s);
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      eachWordReverse ob = new eachWordReverse();
      ob.mindtree("hello how are you");
	}

}
