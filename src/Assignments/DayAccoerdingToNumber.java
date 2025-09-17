package Assignments;

import java.util.Scanner;

public class DayAccoerdingToNumber {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		 switch(num) {
		 case 1:System.out.println("Monday");
		 break;
		 case 2:System.out.println("Tuesday");
		 break;
		 case 3:System.out.println("Wednesday");
		 break;
		 case 4:System.out.println("Thrusday");
		 break;
		 case 5:System.out.println("Friday");
		 break;
		 case 6:System.out.println("Saturday");
		 break;
		 case 7:System.out.println("Sunady");
		 break;
		 default:
			 System.out.println("Invaid number");
		 }
		
	}



}
