package Assignments;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
	    num=s.nextInt();
		
		if(num>0) {
			System.out.println("The number is positive");
			
		}
		else if(num<0) {
			System.out.println("The number is negative");
		}
		else if(num==0) {
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("This is not a number");
		}
	}

}
