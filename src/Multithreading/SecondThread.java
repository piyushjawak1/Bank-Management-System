package Multithreading;

public class SecondThread extends Thread {
	public void run() {
		System.out.println("Thread 1");
	}
	
	
	
	
	public static void main(String[] args) {
		 new SecondThread().start();
		//run method in thread class is responsible to craete new thread.
		 
	
	}

}
