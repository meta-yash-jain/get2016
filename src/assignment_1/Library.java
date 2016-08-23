package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
public class Library {
	BufferedReader bufferedReader = null;
	
	public Library(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
	}

	/**
	 * Entry method of the program
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Library library = new Library();
		Author author = new Author();
		// get DAO Manager single instance
		DAOManager daoManager = DAOManager.getInstance();
		// get user input for name of author
		String nameOfAuthor = library.getUserInput("Please enter name of author");
		author.setAuthorName(nameOfAuthor);
		// book dao object 
		BookDAO bookDao = new BookDAO(daoManager.getConnection());

		List<Book> bookList = bookDao.selectBooks(author);

		if(bookList != null && bookList.size() != 0){
			for(Book book : bookList){
				System.out.println("Title: " + book.getBookTitleName());
			}
		}else{			
			System.out.println("No Books Found");
		}
		daoManager.closeConnection();
	}
	/**
	 * This method sets the user input
	 * 
	 * @param message
	 * @return user input
	 */
	public String getUserInput(String message){
		String userInput = "";
		while(true){
			try{
				System.out.println(message);
				userInput = bufferedReader.readLine();
				return userInput;
			}catch(Exception ex){
				System.out.println("Something went wrong: " + ex.getLocalizedMessage());
			}
		}	
	}
}
