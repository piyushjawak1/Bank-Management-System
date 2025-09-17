package Assignments;

import java.util.Scanner;

public class taskoperator {
public static void main(String[] args) {
	System.out.println("Enter First Number:");
	Scanner s=new Scanner(System.in);
	double num1=s.nextDouble();
	
	System.out.println("Enter Second Number:");
	double num2=s.nextDouble();
	
	System.out.println("Enter operator(+, -, *, /):");
	
	char op=s.next().charAt(0);
	double result;
	
	switch(op) {
	case '+':
		result=num1+num2;
		System.out.println("Addition="+result);
		break;
		
	case '-':
		result=num1-num2;
		System.out.println("Subtraction="+result);
		
		break;
		
	case '*':
		result=num1*num2;
		System.out.println("Multiplication="+result);
		break;
	case '/':
		result=num1/num2;
		System.out.println("Division="+result);
		break;
	default:
			System.out.println("Invalid");
	}
	
}
}
