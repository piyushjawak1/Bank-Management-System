package LogicBuilding;
import java.util.Scanner;
public class SolidSquareP {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	      
	        System.out.print("Enter the size of the square: ");
	        int n=s.nextInt();
           System.out.println("Enter the character:");
           char ch=s.next().charAt(0);
	     
	        for (int i = 1; i <= n; i++) { 
	            for (int j = 1; j <= n; j++) { 
	                System.out.print(ch);
	            }
	            System.out.println();
	        }

	       
	    }
	}


