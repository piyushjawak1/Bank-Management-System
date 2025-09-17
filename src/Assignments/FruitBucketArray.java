package Assignments;

import java.util.Scanner;

public class FruitBucketArray {
	public static void main(String[] args) {
		System.out.println("Enter the size of Fruit Bucket");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String fruits[]=new String[size];//array declaration 2nd way
		for(int i=0;i<size;i++) {
			fruits[i]=s.next();
			
		}
		
		System.out.println("Your fruitBucket is fruits:");
		for(int i=0;i<size;i++) {
			System.out.println(fruits[i]);
		}
		
		
		
	}

}
