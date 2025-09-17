import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperations {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("Update operations..");
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is loaded..");
	

	   String url="jdbc:mysql://localhost:3306/cravita";
	   String username="root";
	   String Password="";
	   Connection c=DriverManager.getConnection(url, username, Password);
	   System.out.println("Connection Successfull..");
	   String u="update lila set name=? where rollno=?";
	   PreparedStatement p=c.prepareStatement(u);
	   p.setString(1,"Prashant");
	   p.setInt(2, 86);
	   
	   p.executeUpdate();
	   
	   System.out.println("Update Successfully..");
	   
	   c.close();
	   System.out.println("Connection Close!!!");
	   
}
}
