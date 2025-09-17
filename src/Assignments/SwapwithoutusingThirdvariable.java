package Assignments;

public class SwapwithoutusingThirdvariable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("A is"+a);
	System.out.println("B is"+b);
}
}
