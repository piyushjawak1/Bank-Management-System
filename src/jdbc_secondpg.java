import java.sql.*;
import java.util.Scanner;

public class jdbc_secondpg {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC 2nd Program");
		//Load the Driver of postgresql
		Class.forName("org.postgresql.Driver");
		System.out.println("Postgresql Driver is loaded..");
		
		//Connection using Postgresql  by using coonection interface
		String url="jdbc:postgresql://localhost:5432/mydb";
		String username="postgres";//default
		String password="root";
		
		Connection cn=DriverManager.getConnection(url, username, password);//.getconnection is a method
		System.out.println("Connection Successful");
		
		//Statement Object
		
		//Statement st=cn.createStatement();//interface
		
		//Create Table 
	
//		String s="create table info(id int,name varchar(20))";//The diff between postgres and sql is
		
		
		
		String insertq="insert into students values(?,?)";
		PreparedStatement ps=cn.prepareStatement(insertq);
		System.out.println("Enter the Information");
		Scanner ns=new Scanner (System.in);
		for(int i=1;i<=5;i++) {
		System.out.println("Enter the rollno of user");
		int rollno=ns.nextInt();
		ps.setInt(1, rollno);
		System.out.println("Enter the name from user");
		String name=ns.next();
		ps.setString(2, name);
		
			
		}
		
		ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String s="insert into info(rollno,name)";                                                     //in postgres=id int or integer ||wamp=id int(20)
		//st.executeUpdate(s);
		//System.out.println("Table is created...");
		
		
		
		
		
		//Insert Data
//		String insert4="insert into info values(4,'Meena')";
//		String insert5="insert into info values(5,'Suresh')";
//		String insert6="insert into info values(6,'Jay')";
//		st.executeUpdate(insert4);
//		st.executeUpdate(insert5);
//		st.executeUpdate(insert6);
		System.out.println("Record Inserted Successfully...");
		
		//Connection Close
		
		cn.close();
		System.out.println("Connection Close....");
		
		
	}

}
