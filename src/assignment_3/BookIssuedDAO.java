package assignment_3;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Data Access Object class for book
//contains all queries related to books issued
public class BookIssuedDAO {	
	private Connection connection = null;
	public BookIssuedDAO(Connection connection){
		this.connection = connection;
	}
	/**
	 * This method displays the total rows deleted of books table 
	 * which are not issued in last 1 year
	 */
	public void BookIssuedDelete(){	
		String sqlQuery = "DELETE b.* FROM Books b "
				+ "LEFT JOIN book_issue bi ON b.accession_no = bi.accession_no "
				+ "WHERE bi.issue_dt IS NULL OR bi.accession_no NOT IN "
				+ "(SELECT accession_no FROM Book_Issue WHERE DATEDIFF(CURRENT_TIMESTAMP,issue_dt) <= 365);";
		
		PreparedStatement prepareStatement = null;
		try{
			prepareStatement = this.connection.prepareStatement(sqlQuery);
			int rowsDeleted = prepareStatement.executeUpdate();
			System.out.println("Total Rows Deleted: " + rowsDeleted);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}