
package assignment_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import assignment_1.Book;

//Data Access Object class for book
//contains all queries related to books issued
public class BookIssuedDAO {
	private Connection connection = null;
	public BookIssuedDAO(Connection connection){
		this.connection = connection;
	}
	/**
	 * This method sets true or false for whether the book
	 * is available for issue or not
	 * 
	 * @param book
	 */
	public void isBookIssued(Book book){
		String sqlQuery = "SELECT COUNT(*) from books b"
				+ " INNER JOIN Titles t ON b.title_id = t.title_id "
				+ "LEFT JOIN book_issue bi ON b.accession_no = bi.accession_no "
				+ "LEFT JOIN book_return br ON b.accession_no = br.accession_no"
				+ " WHERE t.title_nm = ? "
				+ "AND (bi.issue_dt is NULL || (bi.issue_dt is not NULL && br.return_dt is not NULL));";

		PreparedStatement prepareStatement = null;
		try{
			prepareStatement = this.connection.prepareStatement(sqlQuery);
			prepareStatement.setString(1, book.getBookTitleName());
			ResultSet resultSet = prepareStatement.executeQuery();
			if(resultSet != null){
				while(resultSet.next()){
					if(resultSet.getInt(1) > 0){
						book.setBookIssued(true);
					}else{
						book.setBookIssued(false);
					}
				}
			}else{	
				book.setBookIssued(false);
			}
		}catch(Exception ex){

			ex.printStackTrace();
		}
	}
}
