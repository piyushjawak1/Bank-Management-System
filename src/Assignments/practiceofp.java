package Assignments;

import java.util.Scanner;

public class practiceofp {
 public static void main(String[] args) {
	System.out.println("Enter size of fruit bucket");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	
	String fruit[]= new String[size];
	for(int i=0;i<size;i++) {
		 fruit[i]=s.next();
	}
	
	System.out.println("Your bucket is having fruits:");
	for(int i=0;i<size;i++) {
		System.out.println(fruit[i]);
	}
}

}
