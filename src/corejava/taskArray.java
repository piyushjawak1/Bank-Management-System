package corejava;

public class taskArray {
public static void main(String[] args) {
	int a[]= {10,20,30,40,70,50};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<=a.length;j++) {
			System.out.println(a[i]);
		}
	}
	
}
}
