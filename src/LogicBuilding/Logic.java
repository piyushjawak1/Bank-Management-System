package LogicBuilding;

import java.util.Scanner;

public class Logic {
	public static void main(String[] args) {
//		int count=1;
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(count+" ");
//				count++;
//				
//			}
//			System.out.println();
//		}
		
		
//		
//		char ch='A';
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(ch+" ");
//				ch++;
//			}
//			System.out.println();
//		}
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Rows(1-26)");
		int r=s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				System.out.println('A');
				r++;
				
			}
			System.out.println();
		}
	}

}
