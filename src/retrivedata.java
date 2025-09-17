import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class retrivedata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/cravita";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successfull....");
		
		
			String s="select * from lila";
			PreparedStatement p=cn.prepareStatement(s);
			
			ResultSet r=p.executeQuery();
			while(r.next()) {
				System.out.println("Student roll no is:"+r.getInt("rollno"));
				System.out.println("Student name is:"+r.getString("name"));
			}
			cn.close();
	}

}
