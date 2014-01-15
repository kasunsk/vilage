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
	
	public static Connection dbConnection(){
	{
	Connection con = null;
	try {
		 con =
	       DriverManager.getConnection("jdbc:mysql://localhost/vilage?" +
	                                   "user=root&password=root");
		
	} catch (SQLException ex) {
	    // handle any errors
	    log.error("SQLException: " + ex.getMessage());
	    log.error("SQLState: " + ex.getSQLState());
	    log.error("VendorError: " + ex.getErrorCode());
		}
		return con;
	}
		
	}
	
public void test() throws SQLException{
		Connection con=dbConnection();
		Statement st = (Statement) con.createStatement();
		//st.executeUpdate("INSERT INTO test " + "VALUES ('");
}
	
public void addPersion( String name,String id,String sex,String addres, String tp) throws SQLException{
		Connection con=dbConnection();
		Statement st = (Statement) con.createStatement();
		
		st.executeUpdate("INSERT INTO persion VALUES ('"+id+"','"+name+"', '"+sex+"','"+addres+"','"+tp+"')");
		
		con.close();
	}
}
