package Assignments;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a,int v){
		int p=8;
		int q=12;
		if(p<q) {
			System.out.println("The smallest number is:"+p);
		}
		else {
			System.out.println(q);
		}
	}
	ConstructorOverloading()
	{
		int arr[]= {1,2,3};
		for(int i=0;i<=2;i++) {
			System.out.println("The array is: "+arr[i]);
		}
		
	}
	ConstructorOverloading(int a){
		String str=new String("pune");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	ConstructorOverloading(int a,double b){
		
		for(int i=25;i<=310;i++) {
			System.out.println("The numbers are:"+i);
		}
	}
	ConstructorOverloading(float f,double d){
		for(int i=100;i<=200;i++) {
			if(i%2==0) {
				System.out.println("The even numbers are:"+i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(0,0);
		ConstructorOverloading con=new ConstructorOverloading();
		ConstructorOverloading cons=new ConstructorOverloading(1);
		ConstructorOverloading p=new ConstructorOverloading(1,2.0);
		ConstructorOverloading po=new ConstructorOverloading(1.2f,5);
	}

}
