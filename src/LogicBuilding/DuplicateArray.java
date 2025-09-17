package LogicBuilding;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,5};
		int newarr[]=new int [arr.length];
		for(int i=0;i<=arr.length;i++) {
			int count=0;
			for(int j=i+1;j<=arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				newarr[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(newarr));
	}

}
