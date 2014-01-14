package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBConnection {
	
	private static final Logger log = LoggerFactory.getLogger(DBConnection.class);
	
	public DBConnection(){
		
	}
	
	public void dbConnection(){
	{
	Connection con;
	try {
		 con =
	       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
	                                   "user=root&password=root");
		 Statement st = (Statement) con.createStatement();
		 
		 st.executeUpdate("INSERT INTO test " + "VALUES ('Aruni','90V', 'female')");
		 
		 con.close();
		
	} catch (SQLException ex) {
	    // handle any errors
	    log.error("SQLException: " + ex.getMessage());
	    log.error("SQLState: " + ex.getSQLState());
	    log.error("VendorError: " + ex.getErrorCode());
		}
	}
	}
}
