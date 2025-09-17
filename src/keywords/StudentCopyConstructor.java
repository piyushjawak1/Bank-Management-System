package keywords;

public class StudentCopyConstructor {
 int rollno;//12
 String name;//piyush
 
 StudentCopyConstructor(int r,String s){
	 rollno=r;//12
	 name=s;//piyush
	 System.out.println("Student Roll No is :"+rollno);
	 System.out.println("Student Name is :"+name);
 }
 StudentCopyConstructor(StudentCopyConstructor s)//copy constructor
 {
	 System.out.println("Student Roll No is :"+s.rollno);
	 System.out.println("Student Name is :"+s.name);
 }
 
 public static void main(String[] args) {
	 StudentCopyConstructor os=new StudentCopyConstructor(12,"piyush");
	 StudentCopyConstructor oos=new StudentCopyConstructor(os);
}
 
}
