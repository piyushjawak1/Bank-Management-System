package Assignments;
import java.util.Scanner;
public class task6usingscanner {
public static void main(String [] args) {
	System.out.println("Area Of Square");
	
	System.out.println("Enter side of square:");
	Scanner s=new Scanner(System.in);
	int side=s.nextInt();
	
	System.out.println("Area of square is:"+(side*side));
	
	System.out.println("Area of Recatngle");
	int l=s.nextInt();
	int b=s.nextInt();
	System.out.println("Area of Rectangle:"+(l*b));
	
	System.out.println("Area of Triangle");
	int base=s.nextInt();
	int height=s.nextInt();
	System.out.println("Area of Triangle:"+(0.5*base*height));
}
}
