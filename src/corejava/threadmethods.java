package corejava;

public class threadmethods {
	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.setName("This my new thread");
		System.out.println("The name of Thread is: "+t1.getName());
		System.out.println("The Id of Thread is: "+t1.getId());
		t1.setPriority(6);//We can set the priority in range should be in 1 to 10  MinPriority=1 Max=10  
		//default=5
		System.out.println("The priority of Thread is: "+t1.getPriority());
		System.out.println("The is alive of Thread is: "+t1.isAlive());
	
	}

}
