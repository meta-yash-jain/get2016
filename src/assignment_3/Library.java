package assignment_3;

import java.sql.SQLException;
import assignment_1.DAOManager;

public class Library {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		DAOManager daoManager = DAOManager.getInstance();
		BookIssuedDAO bookIssueDAO = new BookIssuedDAO(daoManager.getConnection());
		bookIssueDAO.BookIssuedDelete();
		daoManager.closeConnection();
	}
}