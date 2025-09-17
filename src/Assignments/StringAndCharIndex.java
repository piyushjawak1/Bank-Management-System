package Assignments;

import java.util.Scanner;

public class StringAndCharIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		int index=s.indexOf(ch);
		
		if(index!=-1) {
			System.out.println("Yes String Contains the character: "+ch);
			System.out.println("The index of character is:p "+index);
			
		}	
			else{
				System.out.println("Character is not present in String");
			}
		
		
	}

}
