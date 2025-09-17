package Assignments;

public class Task2Of2DArray {
	public static void main(String[] args) {
		int arr[]= {25,38,96,47,10};
		int n=51;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count=1;
			}
		}
		if(count==0) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element is present in array");
		}
		
		
		
	}

}
