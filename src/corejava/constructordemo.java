package corejava;

public class constructordemo {
	 constructordemo(){
		System.out.println("Hello Default Constructor");
	}
	 constructordemo(int a){
		 System.out.println("Hello Parametrized Constructor");
	 }
	 
	public static void main(String[] args) {
		//Called default constructor
		constructordemo co=new constructordemo();
		//call parametrized condstructor
		constructordemo con=new constructordemo(1);
	}

}
