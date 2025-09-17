package LogicBuilding;

import java.util.Scanner;

public class SolidRectangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int l=s.nextInt();
		System.out.println("Enter the columns");
		int b=s.nextInt();
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=l;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
