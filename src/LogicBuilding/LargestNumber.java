package LogicBuilding;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2&&num1>num2) {
			System.out.println("num1 is Largest");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println("num2 is Largest");
		}
		else {
			System.out.println("num3 is Largest");
		}
	}

}
