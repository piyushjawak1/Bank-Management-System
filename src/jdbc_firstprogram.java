import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_firstprogram {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("First JDBC program");
	Class.forName("com.mysql.cj.jdbc.Driver");//driver name for wamp
	System.out.println("Wampp driver loaded...");
	
	String Url="jdbc:mysql://localhost:3306/cravita";//portnumber and dbname
	String username="root";
	String password="";
	
	Connection cn=DriverManager.getConnection(Url, username, password);
	
	System.out.println("Connection successful");
	String q="create table anil(rollno int(10),name varchar(20))";
	 String insertQuery1 = "INSERT INTO om VALUES(1, 'Piyush')";
     String insertQuery2 = "INSERT INTO om VALUES(2, 'Omkar')";
     String insertQuery3 = "INSERT INTO om VALUES(3, 'Sneha')";

    
	
	Statement st=cn.createStatement();
	 st.executeUpdate(insertQuery1);
     st.executeUpdate(insertQuery2);
     st.executeUpdate(insertQuery3);
	st.executeUpdate(q);
	System.out.println("Query Executed");
	
	cn.close();
	System.out.println("connection close!! thank you!!");
	
			
}
}
