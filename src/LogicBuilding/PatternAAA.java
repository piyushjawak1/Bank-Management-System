package LogicBuilding;

import java.util.Scanner;

public class PatternAAA {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("Enter number of rows (1–26): ");
	      int rows = sc.nextInt();

	      char ch ='A';
	      for (int i = 1; i <= rows; i++) {
	          for (int j = 1; j <= rows; j++) {
	              System.out.print(ch);
	          }
	          System.out.println();
	          ch++;
	      }
	      
	  }
	}
	 

