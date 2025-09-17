import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class practiceofjdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("First JDBC Practice");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Wampp Driver is Loaded...");
		String url="jdbc:mysql://localhost:3306/cravita";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successfull....");
		
		String q="insert into lila values(1,'Jaywant'),(2,'Kavya')";
		Statement st=cn.createStatement();
		st.executeUpdate(q);
		
		System.out.println("Query is Executed");
		
		cn.close();
		System.out.println("Connection Close....");
		
	}

}
