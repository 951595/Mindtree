package java8;

public class Books {
	int bookNumber;
	String bookTitle;
	String author;
	public Books() {
		System.out.println("---default constructor---");
	}

	public Books(int bookNumer, String bookTitle, String author) {
        bookNumber=bookNumber;
		bookTitle=bookTitle;
		author=author;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookNumber(int bookNumber) {
		bookNumber=bookNumber;
	}
	public void setBookTitle(String bookTitle) {
		bookTitle=bookTitle;
	}
	public void setAuthor(String author) {
		author=author;
	}
	public String toString() {
		return "book::"+ "bookNumber:-"+bookNumber + "bookTitle:-"+bookTitle+"author:-"+author;
	}

}
