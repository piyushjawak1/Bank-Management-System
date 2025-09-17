package Assignments;

public class Employee  extends Company{
	void info() {
		super.info();
		System.out.println("Employee Information: ");
		System.out.println("Pratiksha Ma'am");
	}
	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.info();
	}

}
