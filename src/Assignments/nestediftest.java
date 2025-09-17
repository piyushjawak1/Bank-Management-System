package Assignments;

import java.util.Scanner;

public class nestediftest {
public static void main(String[] args) {
	System.out.println("Are U Register?(y/n)");
	Scanner s=new Scanner(System.in);
	char checkreg=s.next().charAt(0);
	boolean checkuser;
	boolean checkpass;
	
	if(checkreg=='y') {
		System.out.println("Registration successfull now u can check condition for login");
		System.out.println("Enter Username");
		checkuser=s.nextBoolean();
		System.out.println("Enter Pssword");
		checkpass=s.nextBoolean();
		if(checkuser==true&&checkpass==true) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Fail");
		}
	}
	else {
		System.out.println("Registration uncessfull please check the condition and login");
	}
}
}
