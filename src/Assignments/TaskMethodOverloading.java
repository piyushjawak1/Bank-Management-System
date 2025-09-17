package Assignments;

public class TaskMethodOverloading {
	void area(int r) {
		System.out.println("Area of Circle: "+3.14*r*r);
	}
	void area(int l,int b) {
		System.out.println("Area of Rectangle is: "+l*b);
	}
	
	void area(double h,double b) {
		System.out.println("Area of Triangle is: "+(0.5*h*b));
	}
	void area(float a) {
		System.out.println("Area of Square is: "+(a*a));
	}
	
    public static void main(String[] args) {
    	TaskMethodOverloading ob=new TaskMethodOverloading();
    	ob.area(5);
    	ob.area(5, 2);
    	ob.area(5.0, 6.0);
    	ob.area(5.0f);
	}

}
