package LogicBuilding;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter the Number: ");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	boolean b=true;
	
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			b=false;
		}
	}
	if(b==true) {
		System.out.println("The number is prime");
	}
	else {
		System.out.println("The number is not a prime number");
	}
}
}
