package Assignments;

public class OddElementsArray {
public static void main(String[] args) {
	int arr[]= {9,0,2,8,1,6,7};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==1) {
			System.out.println(arr[i]);
		}
	}
}
}
