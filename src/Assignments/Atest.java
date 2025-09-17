package Assignments;

import java.util.Scanner;

public class Atest {
   public static void main(String[] args) {
	String s1;
	String s2;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first string:");
	s1=s.next();
	
	System.out.println("Enter second string:");
	s2=s.next();
	if(s1.equals(s2)) {
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	
}
}
