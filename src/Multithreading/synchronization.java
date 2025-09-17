package Multithreading;

class even extends Thread{
	public  synchronized void run() {
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				System.out.println("Thread 1  "+i);
			}
		}
	}
}
class tableof5 extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 2   :"+5*i);
		}
	}
}

public class synchronization {
     public static void main(String[] args) throws InterruptedException {
		even t1=new even();
		t1.start();
		
		//This is one way name as join 
		//second way is  we have to write synchronization keyword in start for that i have to comment joi then next 
		//way i run it.
		//Remember purpose
		
		
		
		//t1.join();
		
		tableof5 t2=new tableof5();
		t2.start();
	}
}
