package LogicBuilding;

import java.util.Scanner;

public class ReverseRombus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	int n=sc.nextInt();
	for(int r=1;r<=n;r++) {
		for(int s=1;s<=n-r;s++) {
			System.out.print(" ");
		}
		for(int c=1;c<=n;c++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
