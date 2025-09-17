package Assignments;

import java.util.Scanner;

public class task4minicalculator {
	public static void main(String [] args) {
		System.out.println("*Mini Calculator*");
		System.out.println("Enter First number:");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		System.out.println("Enter Second number");
		int num2=s.nextInt();
		
		System.out.println(("Addition:")+(num1+num2));
		System.out.println(("Subtraction:")+(num1-num2));
		System.out.println(("Multiplication:")+(num1*num2));
		System.out.println(("Division:")+(num1/num2));
		
		
		
	}

}
