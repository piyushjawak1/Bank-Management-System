package Assignments;

import java.util.Scanner;

public class task8EvenOrOdd {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%2==0){
		System.out.println("The number is even");
	}
	else {
		System.out.println("The number is odd");
	}
}
}
