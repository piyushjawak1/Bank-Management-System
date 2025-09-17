package oops;

class A{
	A(){
		System.out.println("Default Constructor");
	}
	A(int n){
		System.out.println("Paramterized Constructor");
	}
}
class B extends A{
	B(){
		System.out.println("Default Constructor B");
	}
	B(int num){
		
		super(10);
		System.out.println("Paramterized Constructor B");
	}
}
public class ConstructorOverriding {
	public static void main(String[] args) {
		B ob=new B(2);
		B obj=new B();
	}

}
