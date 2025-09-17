package oops;
//child class
public class MethodOverriding extends ploymorphism {
	void details() {
		super.details();
		
		System.out.println("Area:Camp");
	}
	public static void main(String[] args) {
		MethodOverriding ob=new MethodOverriding();
		ob.details();
	}

}
