import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("Delete operations..");
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver is loaded..");
	

	   String url="jdbc:mysql://localhost:3306/cravita";
	   String username="root";
	   String Password="";
	   Connection c=DriverManager.getConnection(url, username, Password);
	   System.out.println("Connection Successfull..");
	   
	   
	   String u="DELETE FROM lila WHERE rollno = ?";
	   PreparedStatement p=c.prepareStatement(u);
	   
	   p.setInt(1, 90);
	   
	   p.executeUpdate();
	   
	   System.out.println("Delete Successfully..");
	   
	   c.close();
	   System.out.println("Connection Close!!!");
	   
}
}
