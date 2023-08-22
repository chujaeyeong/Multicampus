package 화면DB연결;

public class BookVO {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookOwner;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookOwner() {
		return bookOwner;
	}
	public void setBookOwner(String bookOwner) {
		this.bookOwner = bookOwner;
	}
	
	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookOwner="
				+ bookOwner + "]";
	}

	
}
