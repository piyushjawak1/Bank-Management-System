package oops;

public class child extends parent {
	static void b()
	{
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		child o=new child();//object creation
		o.a();
		b();
	}

}
