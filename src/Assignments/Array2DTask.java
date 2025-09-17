package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class Array2DTask {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of First Array:");
		int size1=s.nextInt();
		
		System.out.println("Enter the size of Second Array:");
		int size2=s.nextInt();
		
		if(size1!=size2) {
			System.out.println("Both Arrays are not equal.");
			return;
		}
		else {
			System.out.println("Arrays are equal size.");
		}
		
		//declare array
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		
		
		System.out.println("Enter the element of first array");
		for(int i=0;i<size1;i++) {
			arr1[i]=s.nextInt();
		}
		
		System.out.println("Enter the element of second array");
		for(int j=0;j<size2;j++) {
			arr2[j]=s.nextInt();
		}
		
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Both arrays are equal.");
		}
		else {
			System.out.println("Both arrays are not equal.");
		}
	}





}
