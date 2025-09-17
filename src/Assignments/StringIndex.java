package Assignments;

import java.util.Scanner;

public class StringIndex {
	public static void main(String[] args) {
		String s="piyush";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				System.out.println(i);
			}
		}
	}

}
