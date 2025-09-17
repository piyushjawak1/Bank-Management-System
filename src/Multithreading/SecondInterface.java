package Multithreading;

public class SecondInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int r=7/0;
		System.out.println("This is my second Thread");
	}
	public static void main(String[] args) {
		SecondInterface ob=new SecondInterface();
		Thread T1=new Thread(ob);//thread pripority 1
		Thread T2=new Thread(ob);//thread pripority 2
		Thread T3=new Thread(ob);//thread pripority 3
		
		
		T3.start();
		T2.start();
		T1.start();
		
	}
	

}
