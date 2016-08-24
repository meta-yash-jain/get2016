package assignment_1;

// pojo (Plain Old Java Object) author class
// getter setter for author class
public class Author {
	// author first name
	private String authorName;

	public Author(){
		this.authorName = null;
	}

	public Author(String authorName){
		this.authorName = authorName;
	}
	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String toString(){		
		return this.authorName;
	}
}