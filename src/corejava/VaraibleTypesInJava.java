package corejava;

public class VaraibleTypesInJava {
	static int y=9;
	String str="Pune";
	static void show() {
		byte b=45;
		System.out.println("Local Variable is:"+b);
		System.out.println("global variable is:"+y);
		System.out.println("---------------------");
	}
	void disp() {
		System.out.println("global variable is:"+y);
		System.out.println("------------");
	}
	public static void main(String[] args) {
		show();
		System.out.println("global variable is:"+y);
		//Creation of object
		
		VaraibleTypesInJava ob=new VaraibleTypesInJava();
		ob.area(5,2.0,5.3,8);
		
	}
	void area(int side,double l,double b,double r) {
		System.out.println("Area of square:"+side*side);
		System.out.println("Area of Rectangle:"+l*b);
		System.out.println("Area of :"+(3.14*r*r));
	}
	



}
