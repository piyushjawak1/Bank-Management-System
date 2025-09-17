import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TaskOfInserUpdateDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Task All Operation");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded..");
		

		   String url="jdbc:mysql://localhost:3306/fortune";
		   String username="root";
		   String Password="";
		   Connection c=DriverManager.getConnection(url, username, Password);
		   System.out.println("Connection Successfull..");
		   Scanner sc=new Scanner(System.in);
		   
		   
		   
		   //Create table
//            String createtable="create table student(id int,email varchar(100),name varchar(50),surname varchar(50),password varchar(50))";
//		   Statement st=c.createStatement();
//		   st.executeUpdate(createtable);
		   
		   
		   
		   
		   //Insert Records
		   
//	   System.out.println("How many users you want to insert?");
//		   int n=sc.nextInt();
//		   sc.nextLine();
//		   String insertsql="insert into student values(?,?,?,?,?)";
//		   PreparedStatement ps=c.prepareStatement(insertsql);
//		   for(int i=1;i<=n;i++) {
//			   System.out.println("id:");
//			   int id=sc.nextInt();
//			   ps.setInt(1, id);
//			   System.out.println("email:");
//			   String email=sc.next();
//			   ps.setString(2,email);
//			   System.out.println("name:");
//			   String name=sc.next();
//			   ps.setString(3, name);
//			   System.out.println("surname:");
//			   String surname=sc.next();
//			   ps.setString(4,surname);
//			   System.out.println("password:");
//			   String password=sc.next();
//			   ps.setString(5,password);
//			   
//			   ps.executeUpdate();			   
//			   
//			 }
//		   System.out.println("Record Inserted Successfully");
//		 
//		   
		   
		   
		   
//		   
		   
		   //Update 2 records
//		   String updatesql="update student Set password=? where id=?";
//		   PreparedStatement psupdate=c.prepareStatement(updatesql);
//		   for(int i=1;i<=2;i++) {
//			   System.out.println("Enter Id to update:");
//			   int uid=sc.nextInt();
//			   sc.nextLine();
//			   System.out.println("Enter new password:");
//			   String newpass=sc.nextLine();
//			   psupdate.setString(1, newpass);
//			   psupdate.setInt(2, uid);
//			   psupdate.executeUpdate();
//		   }
//		   System.out.println("Records updated..");
//	   
//		   
		   
		   
		   
		   
		   
		   //delete records
//		   
//		   String deletesql="delete from student where id=?";
//		   PreparedStatement psdelete=c.prepareStatement(deletesql);
//		   
//		   for(int i=1;i<=2;i++) {
//			   System.out.println("Enter id to delete:");
//			   int did=sc.nextInt();
//			   psdelete.setInt(1, did);
//			   psdelete.executeUpdate();			   
//	   }
//		   System.out.println("Records deleted..");
		   
		   
		   //Retrive data
		   
		   String r="select * from student";
		   PreparedStatement pc=c.prepareStatement(r);
		   ResultSet re=pc.executeQuery();
			while(re.next()) {
				System.out.println("Student id is:"+re.getInt("id"));
				System.out.println("Student email is:"+re.getString("email"));
				System.out.println("Student name  is:"+re.getString("name"));
				System.out.println("Student surname  is:"+re.getString("surname"));
				System.out.println("Student password is:"+re.getString("password"));
			}
		 
		   c.close();
		   System.out.println("Connection close!!!");
	} 
	
}
