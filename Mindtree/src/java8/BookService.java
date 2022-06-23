package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Books> getBooksbyNumber() {
		List<Books> booksbyNumber=new Libraray().getALLBooks();
		Collections.sort(booksbyNumber, new Comparator<Books>() {

			@Override
			public int compare(Books o1, Books o2) {
				// TODO Auto-generated method stub
				return (o1.getBookNumber() - o2.getBookNumber());
			}
			
		});
		
		return booksbyNumber;
	}
	public List<Books> getBooksbyAuthor() {
		List<Books> booksbyAuthor=new Libraray().getALLBooks();
		Collections.sort(booksbyAuthor,(o1,o2)-> o1.getAuthor().compareTo(o2.getAuthor()));
		return booksbyAuthor;
	}
	

	public List<Books> getBooksbyTitle(){
		List<Books>booksbyTitle=new Libraray().getALLBooks();
		Collections.sort(booksbyTitle,(o1,o2)-> o1.getBookTitle().compareTo(o2.getBookTitle()));
		return booksbyTitle;
	}
	
}
