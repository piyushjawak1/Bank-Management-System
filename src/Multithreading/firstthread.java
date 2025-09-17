package Multithreading;

public class firstthread extends Thread{
	public void run()
	{
		
		System.out.println("Task1:Printing the even numbers from 1 to 50");
		for(int i=1;i<=50;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new firstthread().start();  
		
	
	}

}
