package LogicBuilding;

import java.util.Arrays;

public class RotateArrayLeft {
	public static void main(String[] args) {
//		int arr[]= {12,15,45,65,78};
//		int temp=arr[0];
//		for(int i=0;i<arr.length-1;i++) {
//			arr[i]=arr[i+1];
//		}
//		arr[arr.length-1]=temp;
//		System.out.println("After rotating array:"+Arrays.toString(arr));
//	}
		
		
		int arr[]= {12,15,45,65,78};
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
		arr[i]=arr[i-1];
		}
		arr[0]=temp;
	System.out.println("After rotating array:"+Arrays.toString(arr));
	}

}
