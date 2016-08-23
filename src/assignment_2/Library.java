package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

import assignment_1.DAOManager;

public class Library {
	BufferedReader bufferedReader = null;
	/**
	 * Sets the buffered reader object 
	 * Empty Library Constructor
	 */
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
		Book book = new Book();
		// get single DAO Manager Instance
		DAOManager daoManager = DAOManager.getInstance();
		// get user input for name of book
		String titleName = library.getUserInput("Please enter name of book");
		book.setBookTitleName(titleName);
		BookIssuedDAO bookIssueDAO = new BookIssuedDAO(daoManager.getConnection());
		bookIssueDAO.isBookIssued(book);
		if(book.isBookIssued()){
			
			System.out.println("Book is available");
		}else{
			System.out.println("Book is not available");
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