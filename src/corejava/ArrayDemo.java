package corejava;

public class ArrayDemo {
	public static void main(String[] args) {
		System.out.println("Array");
		int i;
		
		short ar[]= {90,20,12,45,65,32,78};
		System.out.println("Length of array is:"+ar.length);
		for(i=0;i<ar.length;i++)  //for(i=0;i<=ar.length-1;i++)
			{
			System.out.println(ar[i]);
		}
	}

}
