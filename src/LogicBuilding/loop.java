package LogicBuilding;

import java.util.Scanner;

public class loop {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number:");
	int start=s.nextInt();
	
	System.out.println("Enter Last number:");
	int last=s.nextInt();
	System.out.println("The even numbers are:");
	for(int i=start;i<=last;i++) {
		if(i%2==0) {
			System.out.println(i+"");
		}
	}
	
	
}
}
