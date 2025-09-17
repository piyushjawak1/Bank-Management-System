package corejava;

public class ThreadState extends Thread{
	public void run() {
		System.out.println("In run method:Thread is running");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadState thread1=new ThreadState();
		System.out.println("The state of thread is: "+thread1.getState());
		thread1.start();
		System.out.println("After start thread state is: "+thread1.getState());
		System.out.println("Is thread alive??"+thread1.isAlive());
		
		thread1.sleep(2000);
		System.out.println("After sleep  thread state is:"+thread1.getState());
		System.out.println("Is thread is alive?? "+thread1.isAlive());
		//thread1.stop();
	}

}
