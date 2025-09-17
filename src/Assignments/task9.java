package Assignments;

import java.util.Scanner;

public class task9 {
//check the number is greater than 100 or no is less than equal to 250nu
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>100)
		{
			System.out.println("The no is greater than 100");
		}
		else if(num<=250)
		{
			System.out.println("The no is less than or equal to 250");
	}
		else {
			System.out.println("false");
		}
		
	}
}
