package LogicBuilding;

import java.util.Scanner;

public class ReverseLeftAngleTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows=s.nextInt();
		
		for(int r=rows;r>=1;r--) {
			for(int j=1;j<=r;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
