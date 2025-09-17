package LogicBuilding;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side ");
		
		int side=s.nextInt();
		
		for(int i=1;i<=side;i++) {
			for(int j=1;j<=side;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
 
	

	
	}

