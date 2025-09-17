import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ValueFromUserJDBC {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
   System.out.println("Taking Value From User..");
   
   Class.forName("com.mysql.cj.jdbc.Driver");
   System.out.println("Driver is loaded..");
   
   
   String url="jdbc:mysql://localhost:3306/cravita";
   String username="root";
   String Password="";
   Connection cn=DriverManager.getConnection(url, username, Password);
   
   System.out.println("Connection Successfull..");
   //Important
   String insertq="insert into lila values(?,?)";
   PreparedStatement ps=cn.prepareStatement(insertq);
   System.out.println("Enter the Information..");
   
   Scanner sc=new Scanner(System.in);
   for(int i=1;i<=5;i++) {
   System.out.println("Enter the rollno:");
   int rollno=sc.nextInt();
   ps.setInt(1, rollno);
   
   System.out.println("Enter the name:");
   String name=sc.next();
   ps.setString(2, name);
   
   
   ps.executeUpdate();
   }
   System.out.println("Query Executed..");
   
   cn.close();
   System.out.println("Connection Close!!");

}
}
