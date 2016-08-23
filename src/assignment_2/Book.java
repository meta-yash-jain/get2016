package assignment_2;

//pojo (Plain Old Java Object) book class
//getter setter for book class
public class Book {	
	private String bookTitleName;
	private boolean isBookIssued;
	
	public Book(){		
		this.bookTitleName = null;
		this.isBookIssued = true;
	}
	
	/**
	 * Parameterized constructor for book
	 * 
	 * @param bookTitleName
	 * @param isBookIssued
	 * @param bookAccessionNumber
	 */
	public Book(String bookTitleName, boolean isBookIssued, int bookAccessionNumber){
		this.bookTitleName = bookTitleName;
		this.isBookIssued = isBookIssued;
	}
			
	public String getBookTitleName() {
		return bookTitleName;
	}

	public void setBookTitleName(String bookTitleName) {
		this.bookTitleName = bookTitleName;
	}

	public boolean isBookIssued() {
		return isBookIssued;
	}

	public void setBookIssued(boolean isBookIssued) {
		this.isBookIssued = isBookIssued;
	}

	public String toString(){		
		return "Name: " + this.bookTitleName + "Issued: " + this.isBookIssued;
	}
}