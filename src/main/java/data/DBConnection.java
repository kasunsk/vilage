package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBConnection {
	
	private static final Logger log = LoggerFactory.getLogger(DBConnection.class);
	
	{
	Connection conn;
	try {
		 conn =
	       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
	                                   "user=monty&password=greatsqldb");
	    
	} catch (SQLException ex) {
	    // handle any errors
	    log.error("SQLException: " + ex.getMessage());
	    log.error("SQLState: " + ex.getSQLState());
	    log.error("VendorError: " + ex.getErrorCode());
	}
}
}
